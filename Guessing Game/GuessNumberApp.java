/**
 *GuessNumberApp.java documantation
 *@author Dave Greene
 *31/10/2018
 */
 import java.util.Scanner;
 import java.util.Random;

 public class GuessNumberApp {
	 // declare main method
	 public static void main(String args[]){

		 // declare variables
		 int number;
		 int random;

		 // create object of type Scanner
		 Scanner input = new Scanner(System.in);
		 // create object of type GuessNumber
		 GuessNumber guess = new GuessNumber();
		 // create object random
		 Random randomNumber = new Random();
		 // generate a random number and store it in random
		 random = randomNumber.nextInt(10);
		 guess.setRandom(random);

		 // prompt the user to enter an integer number
		 System.out.println("Please enter an integer number between 0 and 10");
		 number = input.nextInt();
		 System.out.println("");
		 guess.setNumber(number);

		 guess.checkNumber();


		 guess.displayMe();


	 }// close main method


 }// close class