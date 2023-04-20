package sec01.exam00;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2; // 10 + 20 = 30
		System.out.println(intValue1);
		
		char charValue1 = 'A'; // 65
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2; // 65 + 1 = 66(B)
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // int (10 / 4 = 2)
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue 6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0; // double (10 / 4.0 = 2.5)
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y; // double (1.0 / 2 = 0.5)
		System.out.println(result);

	}

}