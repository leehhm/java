package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();  // �θ�Ŭ������ ��ü ����
		System.out.println("������ : " + calculator.areaCircle(r)); // 3.14159 * 10 * 10
		System.out.println();
		
		Computer computer = new Computer();  // �ڽ�Ŭ������ ��ü ����
		System.out.println("������ : " + computer.areaCircle(r)); // pi * 10 * 10
	}
}