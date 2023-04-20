package testexample;

public class MemberService {
	boolean login(String id, String passward) {
		if (id.equals("jang") && passward.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
