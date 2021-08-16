/**
*Groups.java documantation
*"Author Dave Greene
*08-Oct-2018
*
*/
import java.util.Scanner;

public class Groups {

	public static void main(String args[]){

		// declare variables
		int students;
        // Create an object of type Scanner
		Scanner input;
		input = new Scanner(System.in);
        // gather user input
		System.out.println("Please enter how many students you have");
		students = input.nextInt();
		// process our calculations
		int group = students/7;
		System.out.println("You will have " + students + " students in " + group + " Groups");
		int remainder = students%group;
		// Display our results to the user
		System.out.println("and " + remainder + " in an incomplete group");


	}

}