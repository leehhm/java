package sec04.exam18;

public class KeyboardToStringExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];
		
		System.out.println("�Է� : ");
		int readByteNo = System.in.read(bytes);
		
		System.out.println(readByteNo);
		
		String str = new String(bytes,0,readByteNo-2);
		System.out.println(str);
	}
}