import java.util.Scanner;
import java.util.Arrays;

public class UsernameGeneratorApp {

	public static void main(String args[]){

		// create object of type scanner
		Scanner input = new Scanner(System.in);
		// create object of type usernameGenerator
		UsernameGenerator myNewUsername = new UsernameGenerator();
		// decalre variablesd
		String username;
		String newUsername;


		// input
		System.out.println("Please enter your username");
		username = input.nextLine();
		myNewUsername.setUsername(username);

		// process
		myNewUsername.compute();



		// output
		String convertedUsername = myNewUsername.getNewUsername();
		System.out.println(convertedUsername);

		/////Generate username/////

		// declare variables
		int wordCount = 5;
		String first[] = new String [wordCount];
		String second [] = new String [wordCount];

		System.out.println("Enter your first 5 words");
		for (int i=0; i<wordCount; i++){
			System.out.println("Enter word");
			first[i] = input.nextLine();
			myNewUsername.setFirstWords(first);

		}

		System.out.println("Enter your second 5 words");
		for (int j=0; j<wordCount; j++){
			System.out.println("Enter word");
			second[j] = input.nextLine();
			myNewUsername.setSecondWords(second);

		}
		myNewUsername.computeUsername();

		String words[] = myNewUsername.getUsernameWords();
		System.out.println(Arrays.toString(words));



	}



}