package sec05.exam06;

public class StopFlagExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			printThread.setStop(true);
		}
	}

}
