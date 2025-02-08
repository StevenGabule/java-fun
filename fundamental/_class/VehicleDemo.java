package fundamental._class;

class VehicleDemo {
		public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int minivanRange = 0, sportsCarRange = 0;

		minivan.passengers = 6;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		minivanRange = minivan.fuelcap * minivan.mpg;
		sportsCarRange= sportscar.fuelcap * sportscar.mpg;

		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivanRange);
		// Minivan can carry 7 with a range of 336
		
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + sportsCarRange);
		// Sportscar can carry 2 with a range of 168
	}
}