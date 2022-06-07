import pkg.*;
import java.util.Scanner;

class starter {
	public static void special(int a){
		int c = 0;
		if(Math.sqrt(a)%1==0){
			for(int i = 1; i<a; i++){
				if(c==a){
					System.out.println(a+" is a special square");
					break;
				}
				else if(c<a){
					c = i + c;
				}
				else{
					System.out.println(a+ " is not a special square");
					break;
				}
			}
		}
		else{
			System.out.println(a+" is not a special square");
		}
	}
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		special(num);
		
		
	}
}
