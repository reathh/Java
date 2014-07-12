import java.util.Scanner;


public class _01_StuckNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		boolean hasNumbers = false;
		
		String line = in.nextLine();
		String[] splitted = line.split(" ");
		
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(splitted[i]);
		}
		
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int j2 = 0; j2 < numbers.length; j2++) {
					for (int k = 0; k < numbers.length; k++) {
						String ab = "" + numbers[i] + numbers[j];
						String cd = "" + numbers[j2] + numbers[k];
						if (i != j && i!= j2 && i!= k && j != j2 && j!= i && j!= k && j2 != k && j2!=j && j2!=i && ab.equals(cd)) {
//							System.out.println(ab + " " + cd);
							hasNumbers = true;
							System.out.println(numbers[i] + "|" + numbers[j] + "==" + numbers[j2] + "|" + numbers[k]);
						}
					}
				}
			}
		}
		
		if (!hasNumbers) {
			System.out.println("No");
		}
	}

}
