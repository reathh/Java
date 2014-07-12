import java.util.Arrays;
import java.util.Scanner;

/* Write a program to enter a number n and n integer numbers and sort and print them. 
 * Keep the numbers in array of integers: int[]. */

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int[] arrNums = new int[n];
		for (int i = 0; i < arrNums.length; i++) {
			arrNums[i] = in.nextInt();
		}
		Arrays.sort(arrNums);
		for (int j = 0; j < arrNums.length - 1; j++) {
			System.out.print(arrNums[j] + " ");
		}
		System.out.print(arrNums[n - 1]);

	}
}