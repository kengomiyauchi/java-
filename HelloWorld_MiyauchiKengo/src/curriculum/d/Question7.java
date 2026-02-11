package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Question7 {

    // ① ここが main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("プレイヤーの名前を入力してください: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);

        try {
            Character daemon = loadDaemon("daemon_status.txt");

            System.out.println("=== Daemon生成 ===");
            System.out.println("名前: " + daemon.name);
            System.out.println("HP: " + daemon.hp);
            System.out.println("AT: " + daemon.at);
            System.out.println("SP: " + daemon.sp);
            System.out.println("==================");
            
            Character first;
            Character second;

            if (player.sp > daemon.sp) {
                first = player;
                second = daemon;
            } else if (player.sp < daemon.sp) {
                first = daemon;
                second = player;
            } else {
                // 同じならランダム
                if (Math.random() < 0.5) {
                    first = player;
                    second = daemon;
                } else {
                    first = daemon;
                    second = player;
                }
            }

            System.out.println("先攻は " + first.name + "！");
            
            while (player.isAlive() && daemon.isAlive()) {

                first.attack(second);

                if (second.isAlive()) {
                    second.attack(first);
                }

                System.out.println("-----------------");
            }

            if (player.isAlive()) {
                System.out.println("プレイヤーの勝利！");
            } else {
                System.out.println("Daemonの勝利！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }

    // ② ここに書く！！
    public static Character loadDaemon(String fileName) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String name = br.readLine();
        int hp = Integer.parseInt(br.readLine());
        int at = Integer.parseInt(br.readLine());
        int sp = Integer.parseInt(br.readLine());

        br.close();

        return new Character(name, hp, at, sp);
    }

}
