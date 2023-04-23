/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author deby7
 *
 */
public class Java_Regex {

	/**
	 * @param args
	 */
	   public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}

	//Write your code here
	class MyRegex
	{
	    // /*
	    
	    // [01]?\\d{1,2} matches number 0-199
	    // 2[0,4]\\d     matches number 200-249
	    // 25[0-5]              matches number 250-255
	    // */
	    String num="([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	    String pattern=num+"."+num+"."+num+"."+num;
	}

