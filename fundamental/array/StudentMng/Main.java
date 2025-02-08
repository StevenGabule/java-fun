package fundamental.array.StudentMng;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();

		// add students
		manager.addStudent(new Student(0, "Alice", 85.0));
		manager.addStudent(new Student(1, "Bob", 92.0));
		manager.addStudent(new Student(2, "Charlie", 76.3));
		System.out.println("All Students:");
		manager.listAllStudents();
		System.out.println();

		// update student name
		manager.updateStudentName(2, "Bobby");

		// delete a student
		manager.deleteStudent(3);

		System.out.println("All Students:");
		manager.listAllStudents();
		
		// Filter students with grade >= 80.0
		ArrayList<Student> topStudents = manager.filterByGrade(80.0);
		topStudents.forEach(System.out::println);
	}
}
