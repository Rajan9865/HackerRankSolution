/**
 * 
 */
package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Currency_Formatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.t
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india=NumberFormat.getCurrencyInstance(new  Locale("en","in")).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
