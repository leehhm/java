package sec01.exam00;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("ä����", "970815-1000000");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("���ڹ�", "930525-0654321", 30);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println("k2.age : " + k2.age);
	}

}