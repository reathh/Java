import java.util.Scanner;


public class SmallestOf3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String list = in.nextLine();
		String[] listOfNumbers = list.split(" ");
		double min = Double.MAX_VALUE;
		
		for (int i = 0; i < listOfNumbers.length; i++) {
			min = Math.min(Double.parseDouble(listOfNumbers[i]), min);  
		}
		System.out.println(min);
	}

}
