package sec06.exam07;
import java.io.*;
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = {10,20,30,40,50};
		
		os.write(array,1,3);
		
		
		os.flush();
		os.close();
	}

}
