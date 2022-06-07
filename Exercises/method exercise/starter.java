import java.util.Scanner;
import java.util.Random;
class starter {

	public static int calculate(int x, int y){
		int d = x * y;
		if(d%3==0){
			System.out.println("Your product is "+d);
		}
		return d;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter another number: ");
		int b = sc.nextInt();
		sc.nextLine();
		
		calculate(a,b);
		
		
	}
		
}


