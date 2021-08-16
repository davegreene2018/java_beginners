/**
 *StringSnap.java documantation
 *@Author Dave Greene
 *31/10/2018
 */

 import java.util.Scanner;

 public class StringSnap {

	 // declare main method
	 public static void main(String args[]){

		 // create object iof type Scanner
		 Scanner input;
		 input = new Scanner(System.in);

		 // create variables
		 String firstWord;
		 String secondWord;

		 // promt the user to enter the first String
		 System.out.println("Please enter the first word");
		 firstWord = input.nextLine();

		 // prompt the user to enter the second word
		 System.out.println("Please enter the second word");
		 secondWord = input.nextLine();

		 // process & output results
		 if(firstWord.equals (secondWord)){
			 System.out.println("SNAP");
		 }else {
			 System.out.println("Wrong guess, Please try again");
		 }



	 }// close main method



 }// close class