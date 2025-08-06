package promotion;

public class Employee {
	int id;
	String name;
	String designation;
	int salary;
	DESIGNATIONLEVEL level;
	public Employee(int id, String name, String designation, int salary,DESIGNATIONLEVEL level) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.level=level;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", level=" + level + "]";
	}
	
	
	
	

}
