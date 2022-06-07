import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Random rand = new Random();
		
		int a = rand.nextInt(10);
		int b = rand.nextInt(100)+1;
		double c = rand.nextDouble()+2.5;
		double d = rand.nextDouble();
		int e = rand.nextInt(575)+14;
		double f = d+e;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(f);
	}
}
