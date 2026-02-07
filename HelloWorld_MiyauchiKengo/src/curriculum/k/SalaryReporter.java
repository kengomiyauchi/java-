package curriculum.k;

public class SalaryReporter {

	public void report(Payable employee) {
		System.out.println(
				employee.getName() + " の給料は "
				+employee.calculateSalary() + " 円 "
		);
	}
}
