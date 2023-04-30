/**
 * 
 */
package BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_BigDecimal {

	/**
	 * @param args
	 */
	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

       Comparator <String> mycostumCompare=new Comparator<String>() {
           public int compare(String s1, String s2)
           {
               BigDecimal aBigDecimal=new BigDecimal(s1);
               BigDecimal bBigDecimal=new BigDecimal(s2);
               return bBigDecimal.compareTo(aBigDecimal);
           }
       };
       Arrays.sort(s,0,n,mycostumCompare);
    // Arrays.sort(a);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    

}}
