package curriculum;

public class Main {

	/*public static void main(String[] args) {

        Greeting greeting = new Greeting();  // オブジェクト作成
        greeting.sayHello();                 // メソッド呼び出し

    }*/
	
	 public static void main(String[] args) {

	        Animal animal = new Animal();

	        // 値を設定（setter使用）
	        animal.setName("ライオン");
	        animal.setLength(2.1);
	        animal.setSpeed(80);

	        // 出力（getter使用）
	        System.out.println("動物名：" + animal.getName());
	        System.out.println("体長：" + animal.getLength() + "m");
	        System.out.println("速度：" + animal.getSpeed() + "km/h");
	    }
}
