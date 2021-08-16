/**
 *Route66.java class documantation
 *@Author Dave Greene
 *09-Oct-2018
 */
import java.util.Scanner;

 public class Route66App {

	 public static void main(String args[]){
		 // declare our variables
		 double avgSpeed;
		 int members;


		 Scanner input;
		 input = new Scanner(System.in);
		 // gather all the data we need from the user
		 System.out.println("Enter the averag speed per hour");
		 avgSpeed = input.nextDouble();
		 System.out.println("Enter how many team members on your team");
		 members = input.nextInt();



		 Route66 calc;
		 calc = new Route66();
		 // call/invoke
         calc.setResult(avgSpeed);
		 calc.setMembers(members);

		 // display our results22
		 calc.displayMe();


	 }
 }