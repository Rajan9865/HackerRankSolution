/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Substring_Comparisons {

	/**
	 * @param args
	 */
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++)
        {
            String subString=s.substring(i,i+k);
            if(smallest.compareTo(subString)>0)
            {
                smallest=subString;
            }
            if(largest.compareTo(subString)<0)
            {
                largest=subString;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
