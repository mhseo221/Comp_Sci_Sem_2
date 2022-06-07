import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
		System.out.println(a);
		return;
	}
	public static void toStringCombined(String d){
		System.out.println(d);
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String b = sc.nextLine();
		
		System.out.println("Write a sentence");
		String c = sc.nextLine();
		
		System.out.println("This is using the methods!");
		toString(b);
		toStringCombined(b+" "+c);
		
		
	}
}
