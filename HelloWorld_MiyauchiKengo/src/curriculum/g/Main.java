package curriculum.g;

public class Main {

    public static void main(String[] args) {

        // オブジェクト生成
        Employee emp = new Employee();

        // 値を設定（setter使用）
        emp.setEmployeeId("E002");
        emp.setName("田中花子");

        // 値を取得して表示（getter使用）
        System.out.println("社員ID: " 
                + emp.getEmployeeId() 
                + ", 名前: " 
                + emp.getName());
    }
}
