package sec01.exam00;

public class Car3 {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car3() {
		
	}
	
	Car3(String model) {
		this(model, null, 0);
	}
	
	Car3(String model, String color) {
		this(model, color, 0);
	}
	
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}