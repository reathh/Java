import java.util.ArrayList;
import java.util.Scanner;
import java.math.BigDecimal;

public class SimpleExpression {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine() + " ";
	StringBuilder number = new StringBuilder();
		ArrayList<String> numbersAsString = new ArrayList<>();
		for (int i = 0; i < line.length(); i++) {
			char currentChar = line.charAt(i);
			if (currentChar == ' ' && number.toString().equals("")) {
				continue;
			}
			if (currentChar == ' ' && !number.toString().equals("") && !number.toString().equals("+") && !number.toString().equals("-")) {
				numbersAsString.add(new String(number));
				number = new StringBuilder("");
				continue;
			}
			
			if (currentChar == '+' || currentChar == '-' && !number.toString().equals("")) {
				numbersAsString.add(new String(number));
				number = new StringBuilder(currentChar + "");
				continue;
			}
			if (currentChar == '-' || currentChar == '+') {
				number.append(currentChar);
				continue;
			}
			if (currentChar == '0' || currentChar == '1' || currentChar == '2' || currentChar == '3' || currentChar == '4' || currentChar == '5' || currentChar == '6' || currentChar == '7' || currentChar == '8' || currentChar == '9' || currentChar == '.') {
				number.append(currentChar);
				continue;
			}
			if (currentChar == '.') {
				number.append(currentChar);
			}
		}
//		System.out.println(numbersAsString);
//		double[] numbers = new double[numbersAsString.size()];
		BigDecimal[] numbers = new BigDecimal[numbersAsString.size()];
		for (int i = 0; i < numbersAsString.size(); i++) {
			if (!numbersAsString.get(i).equals("")) {
			numbers[i] = new BigDecimal(numbersAsString.get(i).toString());
			}
		}
		
		BigDecimal sum = new BigDecimal("0");
		for (BigDecimal n : numbers) {
			if (n != null) {
			sum = n.add(sum);
			}
		}
		System.out.println(sum);
		
	}
}
