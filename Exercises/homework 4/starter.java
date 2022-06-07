import java.util.Scanner;
class starter {
	public static String calculate(int x, int y){
		int d = x * y;
		if (d%3==0){
			return "It is divisible by 3";
		}
		else{
			return "It is not divisible by 3";
		}
		
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
		System.out.println(calculate(a,b));
		
	}
		
}


