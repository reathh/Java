import java.util.Scanner;

/* Write a program to find how many times given string appears 
 * in given text as substring. The text is given at the first input line. 
 * The search string is given at the second input line. 
 * The output is an integer number. Please ignore the character casing. */

public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		int counter = 0;

		for (int i = 0; i <= sentence.length() - word.length(); i++) {
			if (sentence.substring(0 + i, word.length() + i).contains(word)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
