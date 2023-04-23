/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_String_Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		char[] ch=string.toCharArray();
		String string2="";
		for (int i = ch.length-1; i >=0; i--) {
			string2=string2+ch[i];
		}
		if (string.equals(string2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("NO");
		}
	}

}
