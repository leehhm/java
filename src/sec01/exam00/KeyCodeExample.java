package sec01.exam00;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		// Enter = CR(13), LF(10)
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}