package sec01.exam00;

public class CarExample4 {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5); // Car4의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); // Car4의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car4의 run() 메소드 호출
		}
		
		if (myCar.isLeftGas()) { // Car4의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
	}
}