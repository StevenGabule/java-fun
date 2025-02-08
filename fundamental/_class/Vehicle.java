package fundamental._class;

 class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	Vehicle(int passengers, int fuelcap, int mpg) {
		this.passengers = passengers;
		this.fuelcap = fuelcap;
		this.mpg = mpg;
	}

	void range() {
		System.out.println("Range is " + this.fuelcap * this.mpg);
	}
	
	int totalRange() {
		return this.mpg * this.fuelcap;
	}

	double fuelneeded(int miles) {
		return (double)miles / this.mpg;
	}
}

class AddMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle(6, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14,12);
		double gallons;
		int dist = 252;
		int range1, range2;
		
		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		minivan.range();
		// Minivan can carry 7. Range is 336

		System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
		sportscar.range();
		// Sportscar can carry 2. Range is 168

		range1 = minivan.totalRange();
		range2 = sportscar.totalRange();

		System.out.print("Minivan can carry " + minivan.passengers + ". with a range " + range1);
		// Minivan can carry 7 with range of 336 Miles

		System.out.print("Sportscar can carry " + sportscar.passengers + ". with a range " + range2);
		// Sportscar can carry 2 with range of 168 miles

		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		// To go 252 miles minivan needs 12.0 gallons of fuel.

		gallons = sportscar.fuelneeded (dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
		// To go 252 miles sportscar needs 21.0 gallons of fuel.
	}
}
