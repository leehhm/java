package sec01.exam06;

public class SportsCarExample {

	public static void main(String[] args) {

		SportsCar sportsCar = new SportsCar();
		sportsCar.speed = 0;
		sportsCar.speedUp2();
		System.out.println("���� �ӵ� : " + sportsCar.speed);
		
		sportsCar.speed = 0;
		sportsCar.speedUp();
		System.out.println("���� �ӵ� : " + sportsCar.speed);
		
		sportsCar.stop();
		System.out.println("���� �ӵ� : " + sportsCar.speed);

		}
	}