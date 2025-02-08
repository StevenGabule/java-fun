package fundamental.array;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add(0, "John");
		names.add(1, "Mike");
		names.add(2, "Luis");
		names.add(3, "Harvey");
		
		// System.out.println(names.size()); // 4
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}
}
