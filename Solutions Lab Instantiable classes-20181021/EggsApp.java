/**

Problem 3
Read the next problem, and then draw/write, on paper, the Class Diagram
to plan the classes you will need to write to develop the application.

John the farmer has tasked his son with collecting the eggs from the
chicken cage each morning and putting them in boxes of 1 dozen eggs each.
Unfortunately, John's son Joe is having trouble working out how many boxes
he will need each morning. You have been asked to develop a java application 
to allow Joe to enter the number of eggs he has collected. The application
should then calculate and display how many boxes can be filled and how
many eggs Joe will have leftover.

Your application should use instantiable classes to separate the calculations from the user input and output.

Hint: there are 12 eggs in 1 dozen.

EggsApp 
	-- takes input from the user
	-- uses the Eggs -- the instantiable class to perform the actual computations

@author adriana e chis

*/


import java.util.Scanner;
public class EggsApp{
	public static void main(String args[]){

		// declare variables
		int eggsNum, boxesNum, leftEggsNum;
		
        // declare a variable called sc to be able to work with an object of type Scanner
		Scanner sc;
		// create an object of type Scanner to allow input from the keyboard
		sc = new Scanner(System.in);
		

        // declare a variable named eggsCalc of type Eggs to be able to reuse the instantiable class Eggs
		Eggs eggsCalc;
		// create an object of type Eggs
		eggsCalc = new Eggs();

        // input
		// read the input from the user
		System.out.println("enter number of eggs");
		eggsNum = sc.nextInt();
		// call/invoke the setter method to assign the value provided by the user 
		// set/update the value of the object's instance variable called eggsCount with the value provided via the keyboard
		eggsCalc.setEggsCount(eggsNum);
		
        
		// processing
		// call/invoke the method calculateMetrics() on the object eggsCalc
		eggsCalc.calculateMetrics();
		
		// first, retrieve each metric value using the corresponding getter method
		// second, display each result
		// call/invoke the getter method getBoxesCount() to retrieve the number of boxes, and then store the value in the variable boxesNum
		boxesNum = eggsCalc.getBoxesCount();
		// display the value of boxesNum variable
		System.out.println("number of boxes required: " + boxesNum);
		
		// call/invoke the getter method getLeftEggsCount() to retrieve the number of leftover eggs, and store the value in the variable leftEggsNum
		leftEggsNum = eggsCalc.getLeftEggsCount();
		// display the value of leftEggsCount variable
		System.out.println("remaining eggs: " + leftEggsNum);
	}
}
