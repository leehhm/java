package sec01.exam00;

public class StringConcatExample {

	public static void main(String[] args) {

/*		System.out.println(3+7);  = 10
		System.out.println("3"+7); = 37
		System.out.println(3+"7"); = 37
*/
		
		// 숫자 연산
		int value = 10 + 20 + 8; // 38
		System.out.println("value: " + value);
		
		// 결합(연결) 연산 => 문자열을 만나기 전까지 정수 연산 수행
		String str1 = 10 + 2 + "8"; // 12 8
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8; // 10 2 8
		System.out.println("str2: " + str2);

		String str3 = "10" + 2 + 8; // 10 2 8
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8); // 10 10 => 괄호 안 정수연산은 그대로 수행 
		System.out.println("str4: " + str4);
				
		
	}

}