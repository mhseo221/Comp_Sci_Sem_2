import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter another number: ");
		int b = sc.nextInt();
		
		System.out.println();
		
		if(a!=0){
			if(a%2==0){
				System.out.println("Your first number:\n- even");
			}
			else if(a%2==1){
				System.out.println("Your first number:\n- odd");
			}
		}
		else if(a==0){
			System.out.println("Your first number:\n- neither even or odd");
		}
		
		if(a%3==0){
			System.out.println("- divisible by 3");
		}
		else{
			System.out.println("- not divisible by 3");
		}
		
		if(a%4==0){
			System.out.println("- divisible by 4");
		}
		else{
			System.out.println("- not divisible by 4");
		}
		
		if(a%5==0){
			System.out.println("- divisible by 5");
		}
		else{
			System.out.println("- not divisible by 5");
		}
		
		System.out.println();
		
		if(b!=0){
			if(b%2==0){
				System.out.println("Your second number:\n- even");
			}
			else if(b%2==1){
				System.out.println("Your second number:\n- odd");
			}
		}
		else if(b==0){
			System.out.println("Your first number:\n- neither odd or even");
		}
		
		if(b%3==0){
			System.out.println("- divisible by 3");
		}
		else{
			System.out.println("- not divisible by 3");
		}
		
		if(b%4==0){
			System.out.println("- divisible by 4");
		}
		else{
			System.out.println("- not divisible by 4");
		}
		
		if(b%5==0){
			System.out.println("- divisible by 5");
		}
		else{
			System.out.println("- not divisible by 5");
		}
		
		
		
	}
}
