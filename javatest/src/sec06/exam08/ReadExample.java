package sec06.exam08;
import java.io.*;
public class ReadExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
				System.out.println(data);
			
		}
		is.close();
	}

}
