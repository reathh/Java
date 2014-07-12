import java.util.Scanner;
import java.util.Arrays;

public class SortArraysOfStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String[] strs = new String[a];
		
		for (int i = 0; i < a; i++) {
			strs[i] = in.next();
		}
	Arrays.sort(strs);
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
