/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_String_Tokens {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        //He is a very very good boy, isn't he?
	        s=s.trim();
	        if(s.length()==0)
	        {
	            System.out.println(0);
	            return;
	        }
	        String[] wordsStrings=s.split("[^a-zA-Z]+");//he is very
	        System.out.println(wordsStrings.length);//nu of tokens
	        for (String word : wordsStrings) {
	            System.out.println(word);
	        }
	        // Write your code here.
	        scan.close();
	    }

}
