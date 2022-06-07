import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(1000)+1;
		
		System.out.println("Guess a number between 1 and 1000: ");
		int guess = sc.nextInt();
		
		if(guess==num){
			System.out.println("Congrats! You are correct!");
		}
		else if(guess>num){
			System.out.println("Your number was larger than the number. THe number was "+num+".");
		}
		else{
			System.out.println("Your number was smaller than the number. The number was "+num+".");
		}
	}
}
