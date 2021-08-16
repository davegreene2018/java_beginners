/******************
* Pay documantation
* @uthor Dave Greene
* 04-Oct-2018
*******************/
import java.util.Scanner;

public class PayApp {

	// PayApp main method
	public static void main(String args[]){

		// declare our variables
		double basic;
		double normalHours;
		double overtime;


	    Scanner input;

		// tell the user to enter basic pay
		System.out.println("Please enter the basic pay");
		input = new Scanner(System.in);
		basic = input.nextDouble();

		// tell the user to enter normal hours
		System.out.println("Please enter how many regular hours");
		normalHours = input.nextDouble();

		// tell the user to enter the amount overtime
		System.out.println("Please enter the amount of overtime hours");
		overtime = input.nextDouble();

		// create our object callBasic from instantible class Pay.java
		Pay callBasic;
		callBasic = new Pay();
		// call/invoke
		callBasic.setBasic(basic);
        callBasic.setHours(normalHours);
        callBasic.setOvertime(overtime);


		// display basic
		callBasic.displayResults();



	}


}