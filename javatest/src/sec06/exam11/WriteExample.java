package sec06.exam11;
import java.io.*;
public class WriteExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}

}
