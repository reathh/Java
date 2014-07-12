import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBetweenTwoDays {
	//Write a program to calculate the difference between two dates in number of days. 
	//The dates are entered at two consecutive lines in format day-month-year. 
	//Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100]. 

	public static void main(String[] args) throws ParseException {	
		//Read the input from the console as a string 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a starting date in format dd-MM-yyyy: ");
		String inputStart= reader.nextLine();
		System.out.println("Enter an end date in format dd-MM-yyyy: ");
		String inputEnd = reader.nextLine();

		//Specify the format of the date using the build-in java class 'SimpleDateFormat'
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");	

		//Initialize two date objects which we're going to format
		Date start = null;
		Date end = null;
		String dateStart = inputStart;
		String dateStop = inputEnd;
		start = format.parse(dateStart);
		end = format.parse(dateStop);

		// calculate the difference in milliseconds with the build-in method 'getTime'
		long difference = end.getTime() - start.getTime();

		//calculate the result in days
		long days = difference / (24 * 60 * 60 * 1000);
		System.out.println(days);			
	}
}