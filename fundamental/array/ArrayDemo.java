package fundamental.array;

public class ArrayDemo {
	public static void main(String[] args) {
		// int[] arrayOfNumbers = new int[2];
		// arrayOfNumbers[0] = 1;
		// arrayOfNumbers[1] = 2;
		// int total = 0;

		int[] arrayOfNumbers = { 1, 2, 3, 4, 5 };
		int total = 0;

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			total += arrayOfNumbers[i];
		}
		System.out.println(total);
	}
}
