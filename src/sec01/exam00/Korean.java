package sec01.exam00;

public class Korean {
	
	// �ʵ�	
	String nation = "���ѹα�";
	String name;
	String ssn;
	int age;
	
	// ������
/*	public Korean(String n, String s) {
		name = n;
		ssn = s;
		}
*/
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public Korean(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}

}
