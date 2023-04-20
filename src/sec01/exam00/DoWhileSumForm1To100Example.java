package sec01.exam00;

public class DoWhileSumForm1To100Example {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		do {
			sum += i;
			i++;
		} while (i<=100);

		System.out.println("1 ~ " + (i-1) + " 까지의 합 : " + sum);
	}

}
