package sec01.exam00;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// arraycopy(원본, ~부터, 사본, ~부터, ~까지) 

		for (int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", "); // java, array, copy, null, null,
		}
	}
}	