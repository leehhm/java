package sec01.exam00;

public class PromotionExample {

	public static void main(String[] args) {
		
		// �ڵ� Ÿ�� ��ȯ (���� ���� -> ū ����) = promotion
		
		byte byteValue = 10;
		int intValue = byteValue; // Byte -> int
		System.out.println("intValue: " + intValue);
		
		char charValue = '��';
		intValue = charValue; // char -> int
		System.out.println("���� �����ڵ�: " + intValue);
		
		intValue = 50;
		long longValue = intValue; // int -> long
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // long -> float
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; // float -> double
		System.out.println("doubleValue: " + doubleValue);

	}

}