import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	

	int num = rand.nextInt(1000);
	
	System.out.print("Guess a number: ");
	int ans = sc.nextInt();
	
	while(ans!=num){
		if(ans<num){
			System.out.println("You're little too low!");
			System.out.println();
			System.out.print("Guess a number: ");
			int guess = sc.nextInt();
			ans = guess;
		}
		if(ans>num){
			System.out.println("You're little too high!");
			System.out.println();
			System.out.print("Guess a number: ");
			int guess = sc.nextInt();
			ans = guess;
			
		}
		if(ans==num){
			System.out.println("You guessed it!");
			break;
		}
	}	
	


		
	}
}
