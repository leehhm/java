package sec01.exam00;

public class CastingExample {

	public static void main(String[] args) {
		
		// ���� Ÿ�� ��ȯ (ū ���� -> ���� ����) = casting
		
		int intValue = 44032;
		char charValue = (char) intValue; // char 44032
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue; // int 500
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // int 3.14 => 3
		System.out.println(intValue);

	}

}