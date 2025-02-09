package fundamental.array;

import java.util.Arrays;

public class PrintingArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3]

		int[][] matrix = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepToString(matrix)); // Output: [[1, 2], [3, 4]]
	}
}
