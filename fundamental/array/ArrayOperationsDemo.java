package fundamental.array;

import java.util.Arrays;

public class ArrayOperationsDemo {
	public static void main(String[] args) {
		int[] arr = {9, 5, 7, 1, 3};

		// Sorting
		Arrays.sort(arr);

		// Searching
		int key = 5;
		int index = Arrays.binarySearch(arr, key);
		System.out.println(key + " found at index: " + index); // 2

		// copying
		int[] copy = Arrays.copyOf(arr, 7);
		System.out.println("Extended copy: " + Arrays.toString(copy)); // [1, 3, 5, 7, 9, 0, 0]

		int[] dest = new int[3];
		System.arraycopy(arr, 1, dest, 0, 3); // Copy elements 3,5,7
		System.out.println("System.arraycopy(): " + Arrays.toString(dest));

		// OUTPUT:
		// 5 found at index: 2
		// Extended copy: [1, 3, 5, 7, 9, 0, 0]
		// System.arraycopy(): [3, 5, 7]
	}
}
