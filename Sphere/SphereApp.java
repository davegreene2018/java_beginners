/*
*BankAccountApp documantation
*@Author Dave Greene
*16-Oct-2018
*/
import java.util.Scanner;

public class SphereApp {
	// declare the main method
	public static void main (String args[]){

		// declare variable of type Scanner
		Scanner input = new Scanner(System.in);

		// declare variable of type Sphere
		Sphere mySphere = new Sphere();

		// declare our variables
		double r;
		double a;

		System.out.println("Please enter the radius which you want to calculate");
		r = input.nextDouble();
		mySphere.setRadius(r);

		System.out.println("Radius = " + r);

		double newR = mySphere.volume(r);
		System.out.println("Total area = " + newR);






	}

}