/**
 * 
 */
package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Exception_Handling_Try_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(a/b);
        }
        catch(InputMismatchException exception)
        {
            System.out.println(exception.getClass().getName());
        }
        catch(ArithmeticException exception)
        {
            System.out.println(exception);
        }
    }

}
