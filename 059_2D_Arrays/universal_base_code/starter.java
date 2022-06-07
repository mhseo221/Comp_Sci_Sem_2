import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int first = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter a number: ");
		int second = sc.nextInt();
		System.out.println();
		
		int c = 0;
		int [][] a = new int [first][second];
		for(int i = 0; i<first; i++){
			for(int j = 0; j<second; j++){
				System.out.print("Enter a value: ");
				int value = sc.nextInt();
				a[i][j] = value;
				c += value;
			}
		}
		System.out.println("average: "+c/(first*second));
		

		
	}
}
