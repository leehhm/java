package sec06.exam10;
import java.io.*;
public class ReadExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer,2,3);
		if (readByteNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
