import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [] a = new int[1000];
		Random rand = new Random();
		int c = 0;
		while(c<a.length){
			a[c] = rand.nextInt(10);
			System.out.println(a[c]);
			c++;
		}
	}
}
