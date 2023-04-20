package sec06.exam14;
import java.io.*;
public class WriteExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}

}
