package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();  // 부모클래스로 객체 생성
		System.out.println("원면적 : " + calculator.areaCircle(r)); // 3.14159 * 10 * 10
		System.out.println();
		
		Computer computer = new Computer();  // 자식클래스로 객체 생성
		System.out.println("원면적 : " + computer.areaCircle(r)); // pi * 10 * 10
	}
}