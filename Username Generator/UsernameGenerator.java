public class UsernameGenerator {

	private String username;
	private String newUsername;
	private String first[];
	private String second[];
	private String usernameWords[] = new String[5];

	public UsernameGenerator (){
		username = "";
		newUsername = "";

		}


		public void setUsername (String username){
			this.username = username;

		}

		public String getNewUsername(){
			return newUsername;
		}

		public void compute (){
			StringBuffer buff = new StringBuffer();
			for (int i=0; i<username.length(); i++){
				char letter = username.charAt(i);

				switch(letter){
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
					buff.append("");
					break;
					case ' ':
					buff.append(i);
					break;

					default:
					buff.append(letter);

				}




			}
			buff.append(username.length());
			newUsername = buff.toString();


		}



		public void setFirstWords(String[] value){
			this.first = value;
		}
		public void setSecondWords(String[] value){
			this.second = value;
		}


		public String[] getFirstWords(){
			return first;
		}

		public String[] getUsernameWords(){
			return usernameWords;
		}

		public void computeUsername (){
			int count =5;
			for (int i =0; i<count; i++){
				usernameWords[i] = first[i]+second[i];


			}




		}



}