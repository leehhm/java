package exampletest;

public class Anonymous {
	Worker field = new Worker() {
		public void start () {
			System.out.println("�������� �մϴ�.");
		}
	};
	void metho1() {
		Worker localVar = new Worker() {
			public void start () {
				System.out.println("������ �մϴ�.");
			}
		};
		localVar.start();
	}
	
	void method2(Worker worker) {
		worker.start();
	}
}