import java.util.Scanner;

/*
 * Write a program that enters an array of strings and finds in it all
 * sequences of equal elements. The input strings are given as a single
 * line, separated by a space.
 */

public class _02_SequencesOfEqualStrings {	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = str.split(" ");

		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				System.out.print(" " + arr[i]);
			} else {
				System.out.println();
				System.out.print(arr[i]);
			}
		}
	}
}