/**
 * 
 */
package introduction;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Endoffile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int i=1;
	        while(sc.hasNext())
	        {
	            System.out.println(i++ +" "+ sc.nextLine());
	        }
	        sc.close();
	}

}
