/**
 * 
 */
package BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_BigInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        BigInteger aBigInteger=new BigInteger((scanner.next()));
        BigInteger bBigInteger=new BigInteger((scanner.next()));
        System.out.println(aBigInteger.add(bBigInteger));
        System.out.println(aBigInteger.multiply(bBigInteger));
    }

}
