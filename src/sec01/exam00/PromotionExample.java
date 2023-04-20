package sec01.exam00;

public class PromotionExample {

	public static void main(String[] args) {
		
		// 자동 타입 변환 (작은 범위 -> 큰 범위) = promotion
		
		byte byteValue = 10;
		int intValue = byteValue; // Byte -> int
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // char -> int
		System.out.println("가의 유니코드: " + intValue);
		
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