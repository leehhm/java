package sec04.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1(){
		RemoteControl localVar = new RemoteControl() {
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}	
		};
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
