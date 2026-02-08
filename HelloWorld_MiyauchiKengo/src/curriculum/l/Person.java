package curriculum.l;

class Person{
	  // インスタンスフィールドを定義
	  private String name;
	  private int age;
	  private double height;
	  private double weight;
	  
	  // ★ 人数カウント用（クラス変数）
	  private static int count = 0;
	  
	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  public Person(String name, int age, double height, double weight){
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  
		  count++;  // ★ 作られるたびに増やす
	  }
	  
	  public double bmi() {
		  return weight / (height * height);
	  }
	  
	  public void print() {
		  System.out.println("名前は" + name + "です");
		  System.out.println("年齢は" + age + "です");
		  System.out.printf("BMIは%.2fです\n", bmi());
	  }
	  public static void printCount() {
		  System.out.println("合計" + count + "人です");
	  }
	}