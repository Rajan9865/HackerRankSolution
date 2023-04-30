/**
 * 
 */
package BigNumber;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Primality_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in);)
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}
