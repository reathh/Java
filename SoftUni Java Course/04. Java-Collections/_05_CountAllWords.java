import java.util.Scanner;

/* Write a program to count the number of words in given sentence. 
 * Use any non-letter character as word separator.*/

public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();		
		String[] words = str.split("\\W+");				
		System.out.println(words.length);
	}
}