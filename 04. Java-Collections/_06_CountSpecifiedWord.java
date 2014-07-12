import java.util.Scanner;

/* Write a program to find how many times a word appears in given text. 
 * The text is given at the first input line. The target word is given 
 * at the second input line. The output is an integer number. 
 * Please ignore the character casing. Consider that any non-letter character is a word separator. */

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		String[] str = sentence.split("\\W+");
		int counter = 0;

		for (int i = 0; i < str.length; i++) {
			if (word.equals(str[i])) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}