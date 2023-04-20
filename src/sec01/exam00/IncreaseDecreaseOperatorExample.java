package sec01.exam00;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10, y = 10, z;
		
		System.out.println("--------------------");
		x++; 
		++x; 
		System.out.println("x=" + x); // 12
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y=" + y); // 8
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z=" + z); // 12
		System.out.println("x=" + x); // 13
		
		System.out.println("--------------------");
		z = ++x;
		System.out.println("z=" + z); // 14
		System.out.println("x=" + x); // 14
		
		System.out.println("--------------------");
		z = ++x + y++; // 15 + 8 = 23
		System.out.println("z=" + z); // 22
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9

	}

}
