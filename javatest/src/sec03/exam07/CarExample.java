package sec03.exam07;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run(); // 한국 한국 한국 한국
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run(); // 금호 금호 한국 한국
	}
}