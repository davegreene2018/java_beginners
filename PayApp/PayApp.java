/** PayApp documantation @Dave Greene 2018*/
/******************************************/
import java.util.Scanner;

public class PayApp {
	// main method
	public static void main(String args[]){

	// declare variables
	double basicPay;
	double regularHours;
	double overTime;
	double overTimePay = 1.5;


	Scanner input;

	//	gather how much the basic pay is per hour
	System.out.println("Please enter how much the basic pay per hour is");
	input = new Scanner(System.in);
	basicPay = input.nextDouble();

	// gather how many regular hours
	System.out.println("Please enter the number of regular hours");
	input = new Scanner(System.in);
	regularHours = input.nextDouble();

	// gather how many hours over time
	System.out.println("Please enter how many hours over time you will work");
	overTime = input.nextDouble();


	// display to the user the total amount of hour
	Pay showCalc;

	showCalc = new Pay();
	showCalc.normalHoursCalc(regularHours * basicPay);
	showCalc.displayNormal();

	showCalc.overTimeCalc(basicPay * overTimePay * overTime);
	showCalc.displayOverTime();

	System.out.println("");
	showCalc.displayAll();









	}



}


