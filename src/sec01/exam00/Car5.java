package sec01.exam00;

public class Car5 {
	// �ʵ�
	int speed;
	
	// ������
	
	// �޼ҵ�
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for (int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�. (�ü�:" + speed + "km/h)");
		}
	}
}