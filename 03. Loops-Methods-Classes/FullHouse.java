public class FullHouse {


	public static void main(String[] args) {
		char[] suits = {'\u2666','\u2663', '\u2665','\u2660' };
		String[] cards = {"2", "3","4", "5", "6", "7", "8" ,"9", "10"," J", "Q", "K","A"};
		
		int counter = 0;
		for (int threeOfAKind = 0; threeOfAKind < 13; threeOfAKind++) {
			for (int twoOfAKind = 0; twoOfAKind < 13; twoOfAKind++) {
				if (threeOfAKind != twoOfAKind) {
					for (int firsSuit = 0; firsSuit < 4; firsSuit++) {
						for (int secondSuit = firsSuit + 1; secondSuit < 4; secondSuit++) {
							for (int thirdSuit = secondSuit + 1; thirdSuit < 4; thirdSuit++) {
								for (int fourthSuit = 0; fourthSuit < 4; fourthSuit++) {
									for (int fifthSiuth = fourthSuit + 1; fifthSiuth < 4; fifthSiuth++) {
										System.out.printf("%1$s%3$s %1$s%4$s %1$s%5$s %2$s%6$s %2$s%7$s \n",
												cards[threeOfAKind],cards[twoOfAKind],
												suits[firsSuit], suits[secondSuit], suits[thirdSuit],
												suits[fourthSuit],suits[fifthSiuth]);
										counter ++;
									}
								}
							}
						}
					}

				}
			}

		}
		System.out.println(counter);
    }
}