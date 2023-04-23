/**
 * 
 */
package introduction;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Static_Initializer_Block {

	/**
	 * @param args
	 */
	static int b;
	static int h;
	 static  boolean flag;
	static{
	    Scanner sc=new Scanner(System.in);
	         b=sc.nextInt();
	         h=sc.nextInt();
	          if(b>0&&h>0)
	                {
	                    flag=true;
	                }
	                 else
	                {
	                    System.out.println("java.lang.Exception: Breadth and height must be positive");
	                    flag=false;
	                }
	}
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	       if(flag)
	       {
	           int area=b*h;
	           System.out.println(area);
	       }
	        
	    }

}
