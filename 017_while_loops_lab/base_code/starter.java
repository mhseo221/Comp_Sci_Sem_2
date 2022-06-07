import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a name: ");
	String name = sc.nextLine();
	
	System.out.print("How many times would uou like this name to be repeated?: ");
	int num = sc.nextInt();
	
	int c = 1;
	while(c<=num){
		System.out.println(name);
		c++;
	}

		
	}
}
