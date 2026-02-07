package curriculum.g;

public class Employee {

    // ① プライベートフィールド
    private String employeeId;
    private String name;

    // ② setter
    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ③ getter
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
