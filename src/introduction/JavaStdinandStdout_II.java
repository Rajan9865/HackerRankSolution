/**
 * 
 */
package introduction;

import java.util.Scanner;

/**
 * @author rajan kumar
 *
 */
public class JavaStdinandStdout_II {
	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
         int i = scan.nextInt();
         double d=scan.nextDouble();
       scan.nextLine();
       String s=scan.nextLine();
       System.out.println("String: " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);

	}

}
