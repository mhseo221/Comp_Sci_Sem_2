import java.util.Scanner;
class starter {
	public static boolean checkPrime(int a){
		int b = a - 1;
		int c;
	
		while(true){
			c = a % b;
			b--;
			if(c==0){
				return false;
			}
			if(b==1){
				return true;
			}
			
		}
	}
	public static void printPrimes(int x){
		while(true){
			checkPrime(x);
			if(checkPrime(x)==true){
				System.out.println(x);
			}
			x--;
			
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.nextLine();
	
		printPrimes(num);
	
	}
		
}


