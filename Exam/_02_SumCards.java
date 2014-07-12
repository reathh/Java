import java.util.ArrayList;
import java.util.Scanner;


public class _03_{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	
			String[] line = in.nextLine().split(" ");
			
			
			ArrayList<Integer> arr = new ArrayList<Integer>();
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			for(String str : line) {
				String str1 = str.trim();
				if(str1.length() > 0) {
					String face = str1.substring(0, str1.length() - 1);
					int sumLetters;
					switch (face) {
						case "J": sumLetters = 12;
							break;
						
						case "Q": sumLetters = 13;
						break;
						
						case "K": sumLetters = 14;
						break;
						
						case "A": sumLetters = 15;
						break;
						
						default: sumLetters = Integer.parseInt(face);
					}
					
					arr.add(sumLetters);
				}
			}
			
			arr1.add(arr.get(0));
			
			for (int i = 1; i < arr.size(); i++) {				
					int count = i - 1;
					if(arr.get(count) == arr.get(i)) {
						arr1.remove(count);
						arr1.add(arr.get(count) * 2);
						arr1.add(arr.get(i) * 2);
					} else
						arr1.add(arr.get(i));
			}
			
			
			
			int sum = 0;
			for (int i = 0; i < arr1.size(); i++) {
				sum += arr1.get(i);
			}
			
			System.out.println(sum);
	

	}

}