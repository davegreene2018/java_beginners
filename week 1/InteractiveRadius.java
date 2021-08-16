/** */

import java.util.Scanner;
//
public class InteractiveRadius {

	public static void main(String args[]){

		final double PI = 3.14;
		double radius;
		double area;

		Scanner input;

		System.out.println("Please enter the radius");
		// input
		input = new Scanner(System.in);
		radius = input.nextDouble();

		// process

		area = PI * radius * radius;

		// Output
		System.out.println("Total area of " + radius + " = " + area);






	}

}