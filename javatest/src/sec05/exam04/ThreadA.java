package sec05.exam04;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("THreadA");
		
	}
	
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
