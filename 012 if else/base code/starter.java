import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess a number between 1 and 1000:");
		int guess = sc.nextInt();
		
		if(guess==837){
			System.out.println("Congrats! You are correct!");
		}
		
		else{
			System.out.println("Nope! You are wrong!");
			
		}
		
	}
}
