package sec05.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
			
		for (int j = 0; j < 5; j++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		}
	}

}
