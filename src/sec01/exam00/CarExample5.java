package sec01.exam00;

public class CarExample5 {

	public static void main(String[] args) {
		Car5 myCar = new Car5();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: " + speed + "km/h");
	}
}