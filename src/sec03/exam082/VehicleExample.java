package sec03.exam082;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
