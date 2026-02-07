package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("F001", "山田"));
        employees.add(new ContractEmployee("C001", "佐藤"));

        for (Employee emp : employees) {
            int wage = emp.calculateDailyWage(9);
            System.out.println(emp.getName() + " の給与: " + wage + " 円");
        }
    }
}