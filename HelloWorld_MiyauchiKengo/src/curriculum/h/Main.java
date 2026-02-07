package curriculum.h;

public class Main {

    public static void main(String[] args) {

        FullTimeEmployee full = 
                new FullTimeEmployee("F001", "山田太郎");

        PartTimeEmployee part = 
                new PartTimeEmployee("P001", "佐藤花子");

        System.out.println("正社員の給与: "
                + full.calculateDailyWage(9) + " 円");

        System.out.println("パート社員の給与: "
                + part.calculateDailyWage(9) + " 円");
    }
}