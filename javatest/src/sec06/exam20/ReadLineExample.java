package sec06.exam20;
import java.io.*;
public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Reader reader = new FileReader(
				ReadLineExample.class.getResource("Language.txt").getPath()
				);
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			String data = br.readLine();
			if (data == null) break;
			System.out.println(data);
		}
		br.close();
	}
}