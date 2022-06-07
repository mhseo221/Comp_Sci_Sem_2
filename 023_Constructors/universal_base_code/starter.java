import pkg.*;
import java.util.Scanner;
import java.util.Random;
	
class starter {
	public static void main(String args[]) {
		// Your code goes below here
			
		
		myCharacter test = new myCharacter();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What class would you like to be? ");
		String x = sc.nextLine();
		myCharacter tests = new myCharacter(x);
		
		

		
	}
}
