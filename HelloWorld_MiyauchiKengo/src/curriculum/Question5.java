package curriculum;

public class Question5 {
	/*public static void main(String[] args) {
		  sayHello(); // メソッドを呼び出す
		 }
		 // メソッドの定義
		 public static void sayHello() {
		  System.out.println("Hello,World!");
		 }*/
		 
		 
	 // 2倍にするメソッド
	 /*public static int doubleNumber(int num) {
	  return num * 2;
	 }
	 public static void main(String[] args) {
	  int result = doubleNumber(10); // メソッドの戻り値を変数に格納
	  System.out.println("10を2倍すると" + result + "です。");
	 }*/
	
	
	 public static boolean isEven(int num) {
	        return num % 2 == 0;  // 偶数なら true
	    }

	    public static void main(String[] args) {

	        int num1 = 7;
	        int num2 = 10;

	        if (isEven(num2)) {
	            System.out.println(num2 + " は偶数です。");
	        } else {
	            System.out.println(num2 + " は奇数です。");
	        }

	        if (isEven(num1)) {
	            System.out.println(num1 + " は偶数です。");
	        } else {
	            System.out.println(num1 + " は奇数です。");
	        }
	    }
	 
	
	
}
