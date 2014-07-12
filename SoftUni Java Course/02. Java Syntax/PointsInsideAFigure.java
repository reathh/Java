import java.util.Scanner;




public class PointsInsideAFigure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float x = in.nextFloat();
		float y = in.nextFloat();
		boolean inside = false;
		
		if (x >= 12.5 && x <= 22.5) {
			if (y >= 6 && y <= 8.5) {
				//System.out.println("Inside upper rectangle");
				inside = true;
			}
		}
		if (x >= 12.5 && x <= 17.5) {
			if (y >= 8.5 && y <= 13.5) {
				//System.out.println("Inside square");
				inside = true;
			}
		}
		if (x >= 20 && x <= 22.5) {
			if (y >= 8.5 && y <= 13.5) {
				//System.out.println("Inside lower rectangle");
				inside = true;
			}
		}
		if (inside) {
		System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
	}

}
