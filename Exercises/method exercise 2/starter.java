import java.util.Scanner;
import java.util.Random;

class starter {
	public static int fact(int y){
		int x = y-1;
		while(y>2){
		
			System.out.println(y);
			y = y*x;
			x=x-1;

		}
		return y;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
}
