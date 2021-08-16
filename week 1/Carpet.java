/** */
import java.util.Scanner;

public class Carpet {
	// Main method
	public static void main (String args[]) {
		int width;
		int lenght;
		int area;
		int price = 10;
		int result;



		Scanner input;
		input = new Scanner (System.in);
		// width
		System.out.println("Price = 10 per meter");
		System.out.println("Please enter width in meters");
		width = input.nextInt();
		System.out.println(width);
		// lenght
		System.out.println("Please enter lenght in meters");
		lenght = input.nextInt();
		System.out.println(lenght);

		area = width * lenght;
		result = area * price;

		// area
		System.out.print("Total area = ");
		System.out.print(area);
		System.out.print(" square meters at 10 per meter = ");
		System.out.println(result);


	}


}// end class