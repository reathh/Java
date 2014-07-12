import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class RandomHandOf5Cards {
	//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number 'n': ");
		int numberOfHands = reader.nextInt();
		Random rnd = new Random();
		//Initalize two arrays with the cards faces and suits and store them in an ArrayList
		char[] suits = {'\u2666','\u2663', '\u2665','\u2660' };
		String[] cards = {"2", "3","4", "5", "6", "7", "8" ,"9", "10","J", "Q", "K","A"};
		ArrayList<String> fullDeck = new ArrayList<String>();
		for (String card : cards) {
			for (Character suit : suits) {
				fullDeck.add("" + card + (char)suit);
			}
		}
		//Go through the arrayList pick a random card get its index remove it from the list and print it
		//Add the removed card to the 'pulledcards' array list and at the end of each iteration from
		//'0' to 'n' add the list with removed items to the 'fulldeck' arraylist
		ArrayList<String> pulledCards = new ArrayList<>();
		for (int i = 0; i < numberOfHands; i++) {
			for (int j = 0; j < 5; j++) {
				int index = rnd.nextInt(fullDeck.size());
		        String card = fullDeck.get(index);		        
		        fullDeck.remove(index);
		        pulledCards.add(card);
			    System.out.printf("%s ",card);   			
			}	
			System.out.println();
			fullDeck.addAll(pulledCards);
		}
	}

}