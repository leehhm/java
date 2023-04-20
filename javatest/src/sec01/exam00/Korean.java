package sec01.exam00;

public class Korean {
	
	// 필드	
	String nation = "대한민국";
	String name;
	String ssn;
	int age;
	
	// 생성자
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
