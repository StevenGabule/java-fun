package fundamental.array.Product;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSorter {
	public static void main(String[] args) {
		Product[] products = {
				new Product("Electronics", "Laptop", 999.99, 4.5),
				new Product("Books", "Java Guide", 39.99, 4.8),
				new Product("Electronics", "Headphones", 149.99, 4.2),
				new Product("Books", "Python Basics", 29.99, 4.5),
				new Product("Home", "Blender", 49.99, 4.0)
		};
		
		// Custom Logic
		// Implement complex comparisons using lambda expressions:
		// Comparator<Product> custom = (p1, p2) -> {
    // if (p1.getPrice() == p2.getPrice()) {
		// 			return Double.compare(p2.getRating(), p1.getRating());
		// 	}
		// 	return Double.compare(p1.getPrice(), p2.getPrice());
		// };

		// Custom comparator using method chaining
		Comparator<Product> advancedComparator = Comparator
		.comparing(Product::getCategory, Comparator.nullsFirst(String::compareTo))
		.thenComparingDouble(Product::getPrice)
		.thenComparing(
			Comparator.comparingDouble(Product::getRating).reversed()
		);

		// Sort the array
		Arrays.sort(products, advancedComparator);
		// Arrays.parallelSort(products, advancedComparator); // for large dataset

		// Print sorted products
		Arrays.stream(products).forEach(System.out::println);

		// OUTPUT:
		// [Books] Java Guide - $39.99 ★4.8
		// [Books] Python Basics - $29.99 ★4.5
		// [Electronics] Headphones - $149.99 ★4.2
		// [Electronics] Laptop - $999.99 ★4.5
		// [Home] Blender - $49.99 ★4.0
	}
}

