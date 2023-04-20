package sec03.exam082;

public class Taxi implements Vehicle{
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
