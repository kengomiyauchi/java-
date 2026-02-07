package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Payable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("山田", 8));
		employees.add(new ContractEmployee("佐藤", 8));
		
		SalaryReporter reporter = new SalaryReporter();
		
		for (Payable e : employees) {
			reporter.report(e);
		}
	}

}
