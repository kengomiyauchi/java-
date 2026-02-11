package curriculum.d;


import java.util.Random;

public class Player extends Character {
	
	public Player(String name) {
        super(
            name,
            new Random().nextInt(50) + 50,  // HP 50〜99
            new Random().nextInt(10) + 10,  // AT 10〜19
            new Random().nextInt(10) + 1    // SP 1〜10
        );

        System.out.println("=== プレイヤー生成 ===");
        System.out.println("名前: " + name);
        System.out.println("HP: " + hp);
        System.out.println("AT: " + at);
        System.out.println("SP: " + sp);
        System.out.println("====================");
    }
}
