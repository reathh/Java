import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		
		int ax = in.nextInt();
		int ay = in.nextInt();
		
		int bx = in.nextInt();
		int by = in.nextInt();
		
		int cx = in.nextInt();
		int cy = in.nextInt();
		
		int area = (ax*(by - cy) + bx*(cy - ay) + cx*(ay -by)) / 2;
		
		if (area>= 0){
		System.out.println(area);
		} else {
			System.out.println(area*-1);
		}
	}

}
