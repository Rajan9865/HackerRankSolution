/**
 * 
 */
package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author deby7
 *
 */
public class Tag_Content_Extractor {

	/**
	 * @param args
	 */
public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
              boolean matchfoundBoolean=false;
			Pattern pattern=Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match=pattern.matcher(line);
            while(match.find())
            {
                System.out.println(match.group(2));
                matchfoundBoolean=true;
            }
            if(!matchfoundBoolean)
            {
                System.out.println("None");
            }
			testCases--;
		}
        in.close();
	}
}
