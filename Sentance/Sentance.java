

public class Sentance {

	// declare instance variables
	private String sentance;
	private String newSentance;

	// constructor
	public Sentance (){
		sentance = "";
		newSentance = "";
	}

	public void setSentance(String sentance){
		this.sentance = sentance;

	}

	public String getNewSentance(){
		return newSentance;

	}

	public void compute (){
		StringBuffer buff = new StringBuffer();

		for (int i = 0; i< sentance.length(); i++){
			char letter = sentance.charAt(i);
			switch(letter){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				buff.append("++");
				break;
				case ' ':
				buff.append("-");
				break;
			default:
				buff.append(letter);



			}



		}

		newSentance = buff.toString();


	}










}