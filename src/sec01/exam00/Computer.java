package sec01.exam00;

public class Computer {
	int sum1(int[] values) {   // 매개변수를 배열 형태로 
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {  // 매개변수가 여러개
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
