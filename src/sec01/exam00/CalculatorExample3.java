package sec01.exam00;

public class CalculatorExample3 {

	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		// ���簢���� ���� ���ϱ�
		double result1 = myCalcu.areaRectangle(10); // 10.0 * 10.0 = 100.0
		
		// ���簢���� ���� ���ϱ�
		double result2 = myCalcu.areaRectangle(10, 20); // 10.0 * 20.0 = 200.0
		
		// ��� ���
		System.out.println("���簢�� ���� = " + result1);
		System.out.println("���簢�� ���� = " + result2);
	}
}