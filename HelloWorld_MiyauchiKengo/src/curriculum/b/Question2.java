package curriculum.b;

public class Question2 {

	public static void main(String[] args) {
		
		int score = 75;
		if (score >= 60) { System.out.println("合格です！");}
		
		
		int age = 25;
		if (age >=20 && age <= 30) {
			System.out.println("適正年齢です");
		} else {
			System.out.println("対象外です");
		}
			
		
		int age2 =18;
		if (age2 >=20) {
			System.out.println("成人です");
		}
		if (age2 >=13 && age2 <= 19) {
			System.out.println("ティーンエイジャーです");
		} 
		if (age2 <= 12) {
			System.out.println("子供です");
		}
		
		
		int x = 30;
		int y = 15;
		int z = 50;
		if (x >= y && x >= z) {
		    System.out.println(x);
		} else if (y >= x && y >= z) {
		    System.out.println(y);
		} else {
		    System.out.println(z);
		}
		
		
		int num = -1;
		if(num > 0) {
			System.out.println("正の数です");
		} else if(num < 0) {
			System.out.println("負の数です");
		} else {
			System.out.println("0です");
		}
		
		
		int value = 5;
		if(value % 2 ==0 ) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		
		
		int score2 = 30;
		if(score2 >=90) {
			System.out.println("優");
		} else if(score2 >=70) {
			System.out.println("良");
		} else if(score2 >=50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		
	   
       // String input = sc.nextLine();
        //if (input.isEmpty()) {
          //  System.out.println("入力が無効です");
       // }
        //sc.close(); 
	        
	
	int day = 6;
	  switch (day) {
	   case 1:
	    System.out.println("今日は月曜日です");
	    break;
	   case 2:
	    System.out.println("今日は火曜日です");
	    break;
	   case 3:
	    System.out.println("今日は水曜日です");
	    break;
	   case 4:
	    System.out.println("今日は木曜日です");
	    break;
	   case 5:
	    System.out.println("今日は金曜日です");
	    break;
	   case 6:
	    System.out.println("今日は土曜日です");
	    break;
	   case 7:
	    System.out.println("今日は日曜日です");
	    break;
	   default:
	    System.out.println("無効な値です");
	  }
	
	 
	  int month = 11;
	  switch (month) {
	   case 12,1,2:
	    System.out.println("冬");
	    break;
	   case 3,4,5:
	    System.out.println("春");
	    break;
	   case 6,7,8:
	    System.out.println("夏");
	    break;
	   case 9,10,11:
	    System.out.println("秋");
	    break;
	   default:
	    System.out.println("無効な月です");
	  }
	  
	  
	}
}
