package sec05.exam15;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));
		
		System.out.println("�� ��ü�� : " + set.size());
	}

}
