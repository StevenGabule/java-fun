package fundamental.array.Pixel;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Original image (2x2 pixels)
		Pixel[][] original = {
				{ new Pixel(255, 0, 0), new Pixel(0, 255, 0) }, // Red, Green
				{ new Pixel(0, 0, 255), new Pixel(255, 255, 255) } // Blue, White
		};

		// Processed copy
		Pixel[][] grayscale = ImageProcessor.toGrayscale(original);

		// Verify original is unchanged
		System.out.println("Original (unchanged):");
		Arrays.stream(original).forEach(row -> System.out.println(Arrays.toString(row)));

		System.out.println("\nGrayscale Copy:");
		Arrays.stream(grayscale).forEach(row -> System.out.println(Arrays.toString(row)));

		// OUTPUT:
		// Original (unchanged):
		// [(255, 0, 0), (0, 255, 0)]
		// [(0, 0, 255), (255, 255, 255)]

		// Grayscale Copy:
		// [(85, 85, 85), (85, 85, 85)]
		// [(85, 85, 85), (255, 255, 255)] // White remains unchanged
	}
}
