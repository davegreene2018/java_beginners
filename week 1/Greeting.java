/** Documentation for Greeting class*/


import java.util.Scanner;

public class Greeting {

	public static void main(String args[]){

		String name;
		Scanner input;

		System.out.println("Hello what is your name");
		input = new Scanner (System.in);
		name = input.nextLine();
		System.out.println("");

		System.out.println("Hello " + name + " how are you :)");
		System.out.println("");

	}


}// end class