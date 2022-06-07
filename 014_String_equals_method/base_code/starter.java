import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		 String ans = sc.nextLine();
		 
		 if(ans.equals("Wizard")){
		 	System.out.println("You've chosen the Wizard! Excelsior!");
		 }
		 else if(ans.equals("Warrior")){
		 	System.out.println("You've chose the Warrior! For honor!");
		 }
		 else if(ans.equals("Rogue")){
		 	System.out.println("You've chosen the Rogue! How cunning!");
		 }
		 else{
		 	System.out.println("You've decided not to chose a role. Rerun the program.");
		 }
	}
}
