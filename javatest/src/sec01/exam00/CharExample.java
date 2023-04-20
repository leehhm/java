/*   유니코드 대입되는 숫자
 *   0 = 48, A = 65, a = 97
 */

package sec01.exam00;

public class CharExample {

public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; // 16^1 * 4 + 1 = 65
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00'; // 16^3 * 10 + 16^2 * 12 => 40,960 + 3,072 = 44,032

		char c7 = 97;
		char c8 = 'a';
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

		System.out.println(""+c7+c8);
	}

}
