import java.util.Scanner;

public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] letters = in.next().toCharArray();
		if (letters.length == 1) {
			System.out.printf("%s%s%s", letters[0], letters[0], letters[0]);
		} else if (letters.length == 2) {
			for (int a = 0; a < 2; a++) {
				for (int b = 0; b < 2; b++) {
					for (int c = 0; c < 2; c++) {
						System.out.printf("%s%s%s ", letters[a], letters[b],
								letters[c]);
					}
				}
			}
		} else if (letters.length == 3) {
			for (int a = 0; a < 3; a++) {
				for (int b = 0; b < 3; b++) {
					for (int c = 0; c < 3; c++) {
						System.out.printf("%s%s%s ", letters[a], letters[b],
								letters[c]);
					}
				}
			}
		}
	}

	

}
