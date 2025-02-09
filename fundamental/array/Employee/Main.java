package fundamental.array.Employee;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee[] employees = {
			new Employee(101, "Alice", "Engineering", 85000),
			new Employee(102, "Bob", "Marketing", 75000),
			new Employee(103, "Charlie", "Engineering", 95000),
			new Employee(104, "David", "HR", 65000),
		};

		// Binary Search (required sorted array)
		Arrays.sort(employees);
		Employee found = EmployeeSearch.BinarySearchById(employees, 103);
		System.out.println("Binary search result: \n" + found);

		// Linear Name Search
		// NOTE: O(n) time complexity (slower for large datasets).
		Employee[] alices = EmployeeSearch.searchByName(employees, "ALICE");
		System.out.println("\nEmployees named 'alice': ");
		Arrays.stream(alices).forEach(System.out::println);

		// Advanced Filter
		Employee[] engHighEarners = EmployeeSearch.filterEmployees(employees, "Engineering", 80000, 100000);
		System.out.println("\nEngineering employee earning $80k-$100k");
		Arrays.stream(engHighEarners).forEach(System.out::println);

		// Binary Search Result:
		// ID: 103 | Charlie (Engineering) | Salary: $95,000.00

		// Employees named 'Alice':
		// ID: 101 | Alice (Engineering) | Salary: $85,000.00

		// Engineering employees earning $80k-$100k:
		// ID: 101 | Alice (Engineering) | Salary: $85,000.00
		// ID: 103 | Charlie (Engineering) | Salary: $95,000.00
	}
}
