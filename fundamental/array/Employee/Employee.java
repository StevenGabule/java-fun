package fundamental.array.Employee;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() { return id; }
	public String getName() { return name; }
	public String getDepartment() { return department; }
	public double getSalary() { return salary; }

	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return String.format("ID: %d | %s (%s) | Salary: $%,.2f", id, name, department, salary);
	}
}
