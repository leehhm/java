package sec01.exam00;

public class Car6 {
	// �ʵ�
	String model;
	int speed;
	
	// ������
	Car6(String model) {
		this.model = model;
	}
	
	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�. (�ü�:" + this.speed + "km/h)");
		}
	}
}