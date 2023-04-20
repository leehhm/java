package sec01.exam00;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		// final로 초기값을 주었기 때문에 변경 불가능
		
		p1.name = "홍삼원";

	}

}
