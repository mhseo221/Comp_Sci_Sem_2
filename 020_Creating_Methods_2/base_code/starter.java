import java.util.Scanner;
import java.util.Random;

class starter {
	public static void pow(int a, int b){
		int c = 1;
		int d = 1;
		int e = 0;
		while(c<=b){
			e = d * a;
			d = e;
			c++;
		}
		System.out.println("Your answer is: " + e);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int x = sc.nextInt();
	System.out.println("What is your exponent number?");
	int y = sc.nextInt();
	pow(x,y);


		
	}
}
