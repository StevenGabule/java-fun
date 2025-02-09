package fundamental.array.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSearch {
	// Binary search for ID (array must be sorted by ID)
	public static Employee BinarySearchById(Employee[] employees, int targetId) {
		Comparator<Employee> idComparator = Comparator.comparingInt(Employee::getId);
		int index = Arrays.binarySearch(employees, new Employee(targetId, "", "", 0), idComparator);
		return (index >= 0) ? employees[index] : null;
	}

	// Linear search for name (case-insensitive)
	public static Employee[] searchByName(Employee[] employees, String targetName) {
		return Arrays.stream(employees)
				.filter(e -> e.getName().trim().equalsIgnoreCase(targetName.trim()))
				.toArray(Employee[]::new);
	}

	// Linear search for department
	public static Employee[] searchByDepartment(Employee[] employees, String department) {
		return Arrays.stream(employees).filter(e -> e.getDepartment().equals(department)).toArray(Employee[]::new);
	}

	public static Employee[] filterEmployees(Employee[] employees, String department, double minSalary, double maxSalary) {
		return Arrays.stream(employees)
		.filter(e -> e.getDepartment().equals(department))
		.filter(e -> e.getSalary() >= minSalary && e.getSalary() <= maxSalary)
		.toArray(Employee[]::new);
	}

}
