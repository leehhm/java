package sec01.exam00;

public class CarExample4 {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5); // Car4�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas(); // Car4�� isLeftGas() �޼ҵ� ȣ��
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); // Car4�� run() �޼ҵ� ȣ��
		}
		
		if (myCar.isLeftGas()) { // Car4�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}