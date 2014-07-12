import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
 
 
public class _12_CardsFrequencies {
 
        public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                        String[] cards = scanner.nextLine().split("[♥♣♦♠ ]+");
                        int N = cards.length;
                        // use linked hash map to preserve initial order of elements
                        Map<String, Integer> cardOccurrences = new LinkedHashMap<String, Integer>();
                       
                        for (String card : cards) {
                                Integer count = cardOccurrences.get(card);
                                if (count == null) count = 0;
                                cardOccurrences.put(card, count + 1);
                        }
                       
                        // print
                        for (Map.Entry<String, Integer> entry : cardOccurrences.entrySet()){
                                System.out.printf("%s -> %.2f%%\n", entry.getKey(),
                                                (double)entry.getValue() * 100 / N);
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
 
}