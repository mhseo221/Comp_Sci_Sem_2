import java.util.Random;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int [] a = new int[20];
		int [] b = new int[20];
		int c = 0;
		while(c<a.length){
			System.out.println(a[c]=rand.nextInt(49)+1);
			c++;
		}
		System.out.println("------------");
		c=0;
		int d = a.length-1;
		while(c<a.length&&d>=0){
			System.out.println(b[c]=a[d]);
			c++;
			d--;
		
		}
	}
		
}
