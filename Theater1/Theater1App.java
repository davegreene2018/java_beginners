/**
 *Theater1App.java documantation
 *@author Dave Greene
 *31/10/2018
 */
import java.util.Scanner;

 public class Theater1App {

	 // declare main method
	 public static void main (String args[]){

		 // declare object of data type Scanner
		 Scanner input = new Scanner(System.in);

		 // declare object of type Theater1
		 Theater1 theater = new Theater1 ();

		 // declare variables
		 String day;

		 // prompt the user to enter the day
		 System.out.println("Enter the day:");
		 day = input.nextLine();
		 theater.setD(day);

		 // display results
		 theater.getResult(day);

	 }

 }
