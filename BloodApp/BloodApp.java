/**
 *BloodApp.java documantation
 *@author Dave Greene
 *31/10/2018
 */

 import java.util.Scanner;

 public class BloodApp {
	 // declare main method
	 public static void main(String args[]){

		 // declare variables
		 int age;
		 String bloodGroup;


		 // create object of type Scanner
		 Scanner input = new Scanner(System.in);
		 // create an object of type Blood
		 Blood myBlood = new Blood();

		 // prompt the user to enter their age
		 System.out.println("Please enter your age");
		 age = input.nextInt();
		 myBlood.setAge(age);

		 // call the method isOldEnough
		 myBlood.isOldEnough(age);



		 // prompt the user to enter there blood group
		 System.out.println("Please enter your blood group");
		 input.nextLine();
		 bloodGroup = input.nextLine();
		 myBlood.setBlood(bloodGroup);

		 // check blood
		 myBlood.checkBlood();


         myBlood.displayMe();
	 }


 }// close class