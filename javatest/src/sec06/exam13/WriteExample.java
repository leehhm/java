package sec06.exam13;
import java.io.*;
public class WriteExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = {'A','B','C','D','E'};
		
		writer.write(array,1,3);
		
		writer.flush();
		writer.close();
	}

}
