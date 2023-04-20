
public class leehyenmin_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {83,90,87};
		int sum = 0;
		double avg = 0;
		int coin = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			coin++;
		}
		avg = (double)sum/coin;
		System.out.println(sum);
		System.out.println(avg);
	}

}
