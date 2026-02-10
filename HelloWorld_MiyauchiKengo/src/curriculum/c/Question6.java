package curriculum.c;

class Question6 {
	
	public static void main(String[] args) {
		
		Player player = new Player();
		CPU cpu = new CPU();
		
		boolean win = false;
		
		while (!win) {
			
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();
			
			System.out.println("あなたの手: " + getHandName(playerHand));
            System.out.println("CPUの手: " + getHandName(cpuHand));

            if ((playerHand == 0 && cpuHand == 1) ||
            	(playerHand == 1 && cpuHand == 2) ||
            	(playerHand == 2 && cpuHand == 0)) {
            	
            	System.out.println("あなたの勝ち！");
            	win = true;
            } else if (playerHand == cpuHand) {
            	
            	System.out.println("あいこ！もう1回！");
            	
            } else {
            	
            	System.out.println("あなたの負け！もう1回！");
            }
			System .out .println();
		}
	}

	// 手の名前を表示用に変換
	public static String getHandName(int hand) {
		if(hand == 0) return "グー";
		if(hand == 1) return "チョキ";
		if(hand == 2) return "パー";
		return "不明";
	}
}
