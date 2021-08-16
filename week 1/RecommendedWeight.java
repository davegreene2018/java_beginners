/** displays the recommended weight given the user’s
age and height in centimeters */

import java.util.Scanner;

public class RecommendedWeight {

	public static void main(String args[]){

		double height;
		double weight;
		int age;
		String name;

		Scanner userinput;
		// enter the users name
		System.out.println("Hello please enter your first name");
		userinput = new Scanner(System.in);
		name = userinput.nextLine();
		// enter user height
		System.out.println("Hi " + name + " Please enter your height in cm");
		userinput = new Scanner(System.in);
		height = userinput.nextDouble();
		// enter user age
		System.out.println(name + " Please enter your age");
		userinput = new Scanner(System.in);
		age = userinput.nextInt();
		// process the recommended weight
		weight = (height - 100 + age % 10) * 0.90;
		// display to the user the recommended weight
		System.out.println(name +" your recommended weight is " + weight + " kg");


	} // close main method
} // close class