import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int a = sc.nextInt();
		
		System.out.println("input - "+a);
		int b = a + 4;
		while(a<=b){
			System.out.println(a);
			a++;
		}
		
	}
}
