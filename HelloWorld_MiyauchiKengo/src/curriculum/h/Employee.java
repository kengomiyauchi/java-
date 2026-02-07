package curriculum.h;

public abstract class Employee {

    protected String employeeId;
    protected String name;

    // コンストラクタ
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // 抽象メソッド
    public abstract int calculateDailyWage(int hoursWorked);
}
