package fundamental.array;

public class MultidimensionalArray {
	public static void main(String[] args) {
		// Rectangular 2D array (3x3)
		int[][] matrix = new int[3][3];

		// Initialize with values
		int[][] grid = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};

		int[][] jagged = new int[3][];
		jagged[0] = new int[2]; // Row 0: 2 elements
		jagged[1] = new int[4]; // Row 1: 4 elements
		jagged[2] = new int[3]; // Row 2: 3 elements

		// 3D array (2x3x4)
		int[][][] cube = new int[2][3][4];

		// Access 2D array element
		int value = grid[1][2]; // 6

		// Modify jagged array
		jagged[0][1] = 100;

		// Nested For-Loops (2D)
		for (int i = 0; i < grid.length; i++) {
			for(int j = 0; i < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		// Enhanced For-Loops (Jagged)
		for (int[] row : jagged) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
