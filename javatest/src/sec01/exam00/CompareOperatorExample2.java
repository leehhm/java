package sec01.exam00;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true (1.0 == 1.0)
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false (0.10000000... != 0.1000000)
		System.out.println((float)v4 == v5); // true (0.1000000 == 0.1000000)
		System.out.println((int)(v4*10) == (int)(v5*10)); // true (1 == 1)
		
	}

}