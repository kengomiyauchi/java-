package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean isBoolean;
		
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum * 2);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(10.5 / 100);
		System.out.println(10 - 100);
		
		
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん!");
		
		
		int age = 25;
		System.out.println("年齢:" + age + "歳");
		
		
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		
		int score = 80;
		System.out.println(score + 20);
		
		
		double price = 99.99;
		int i = (int) price;
		System.out.println("整数価格:" + (int) i );
		
		
		String numStr = "123";
		int num = Integer.parseInt(numStr); 
		System.out.println("変更後値:" + (num + 10));
		
		
		int num3 = 50;
		String str = String.valueOf(num3);
		System.out.println("得点:" + str + "点");
		
		
		int a =10;
		int b =20;
		boolean result = (a < b) ? true : false;
		System.out.println(result);
		
		
		int x = 15;
		System.out.println(x >= 10 ? "OK" : "NG");
		
		
		String text = "私はJavaが好きです。Javaは楽しい！";
		text = text.replace("Java" , "Python");
		System.out.println(text);
		
		
	}

}
