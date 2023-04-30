/**
 * 
 */
package introduction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author deby7
 *
 */class Result {

	 

	    public static String findDay(int month, int day, int year) {
	   Calendar cal = Calendar.getInstance();
	        cal.set(Calendar.MONTH,month-1);
	        cal.set(Calendar.DAY_OF_MONTH,day);
	        cal.set(Calendar.YEAR,year);
	String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
	        return dayOfWeek;
	    }

	}

public class Java_Date_and_Time {

	/**
	 * @param args
	 */
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	   
	 }
}
