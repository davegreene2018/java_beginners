/**
 *Route66.java class documantation
 *@Author Dave Greene
 *09-Oct-2018
 */


 public class Route66 {
		// declare our variables
		private double distance = 3945;
		private double speed;
		private double members;
        private double totalBlocks;
		private double blocks = 15;
		private double membersFullblocks;

        // get our data from the user and store in variables
        public void setResult(double value){
				speed = value;
		}
		public void setMembers(double value){
				members = value;
	    }

	    public void displayMe(){
			// process our calculations
			double hours = distance/speed;
		    double totalBlocks = distance/speed/blocks;
		    double remainder = members-(int)totalBlocks;
		    double membersFullblock = (members/totalBlocks)*totalBlocks - remainder;
		    double leftOver = (totalBlocks-membersFullblock)* blocks;



            // display results
			System.out.println("It will take " + hours + " hours to complete the journey");
			System.out.println("Total number of full blocks " + totalBlocks + " to complete the journey");
			System.out.println("Only " + (int)membersFullblock + " members of the team will cycle full blocks of "+ blocks + " hours");
			System.out.println((int)remainder + " member of the team left with the next member to cycle " + leftOver + " hours");

		}


 }