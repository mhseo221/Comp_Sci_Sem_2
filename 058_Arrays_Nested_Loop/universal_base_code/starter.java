import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What symbol would you like to use?");
		String a = sc.nextLine();
		
		System.out.println("What's the width of your box?");
		int b = sc.nextInt();
		System.out.println();
		
		System.out.println("What's height of your box?");
		int c = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i<c; i++){
			for(int j = 0; j<b; j++){
				System.out.print(a);
			}
			System.out.println();
		}
		

		
	}
}
