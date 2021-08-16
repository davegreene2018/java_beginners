
import java.util.Scanner;

public class SentanceApp {

	public static void main(String args[]){



		Scanner input = new Scanner(System.in);
		Sentance mySentance = new Sentance();
		System.out.println("Please enter a sentance");
		String sentance = input.nextLine();
		mySentance.setSentance(sentance);

		mySentance.compute();

		String myNewSentance = mySentance.getNewSentance();
		System.out.println(myNewSentance);


	}


}