import java.util.ArrayList;
import java.util.Scanner;

/* Write a program that reads two lists of letters l1 and l2 and combines them: 
 * appends all letters c from l2 to the end of l1, but only when c does not appear in l1. 
 * Print the obtained combined list. All lists are given as sequence of letters separated 
 * by a single space, each at a separate line. Use ArrayList<Character> of chars 
 * to keep the input and output lists. */

public class _09_CombineListsОfLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Character> arrFL = new ArrayList<Character>();
		ArrayList<Character> arrSL = new ArrayList<Character>();
		ArrayList<Character> arrPrint = new ArrayList<Character>();

		for (char ch : in.nextLine().toCharArray()) {
			arrFL.add(ch);
		}
		for (char ch : in.nextLine().toCharArray()) {
			arrSL.add(ch);
		}
		arrPrint.addAll(arrFL);

		for (int i = 0; i < arrSL.size(); i++) {
			if (arrFL.contains(arrSL.get(i))) {
				continue;
			} else {
				arrPrint.add(' ');
				arrPrint.add(arrSL.get(i));
			}
		}

		for (int i = 0; i < arrPrint.size(); i++) {
			System.out.print(arrPrint.get(i));
		}
	}
}