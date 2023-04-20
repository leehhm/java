package sec05.exam14;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/jsp");
		set.add("JAVA");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö : " + size);
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
		
		iterator = set.iterator();
		for (String element : set) {
		System.out.println("\t" + element);
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("ºñ¾îÀÖÀ½");
		}
		}
		
	}

}
