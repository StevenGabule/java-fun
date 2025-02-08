package fundamental;

public class GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters;
		int separatorCount = 0;
		for(gallons = 1; gallons <= 100;gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + 
													liters + " liters.");
			separatorCount++;
			if(separatorCount == 10) {
				System.out.println();
				separatorCount = 0;
			}
		}
	}
}
