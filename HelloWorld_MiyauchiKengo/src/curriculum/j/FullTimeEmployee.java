package curriculum.j;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		
		int hourlyRate = 1250;
		
		if (hoursWorked <= 8) {
			return hoursWorked * hourlyRate;
		} else {
			int overtime = hoursWorked  - 8;
			return (8 * hourlyRate)
					+ (int)(overtime * hourlyRate * 1.25);
		}
	}
	
}
