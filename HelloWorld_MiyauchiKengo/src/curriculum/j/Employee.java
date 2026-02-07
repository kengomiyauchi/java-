package curriculum.j;

public abstract class Employee implements Billable {
	
	protected String id;
	protected String name;
	
	// コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// getter(あってもOK)
	public String getId() {
		 return id;
	}
	
	public String getName() {
		return name;
	}
	
}
