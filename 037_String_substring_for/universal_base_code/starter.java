import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		System.out.println("Letter by letter: ");
		int [] a = new int[word.length()];
		for(int i = 0; i<a.length; i++){
			System.out.println(i+ " " + word.substring(i,i+1));
		}


		
	}
}
