/**
 * 
 */
package introduction;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Datatypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                System.out.println("* byte");
                //Complete the code
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if(x>=Short.MIN_VALUE&&x<=Short.MAX_VALUE)
            {
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
             else if(x>=Integer.MIN_VALUE&&x<=Integer.MAX_VALUE)
            {
                // System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(x>=Long.MIN_VALUE&&x<=Long.MAX_VALUE)
            {
                // System.out.println("* short");
                // System.out.println("* int");
                System.out.println("* long");
            }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

	}

}
