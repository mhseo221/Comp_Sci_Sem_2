import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics{
	int c = 1;
	public static int factorial(int n){
		for(int i = n; i<0; i--){
			c = c * i;
		}
		return c;
	}
	
	public static void numComninations(int n, int r){
		if(r>n){
			System.out.println("There are 0 ways of choosing "+r+" items from "+n+" choices");
			
		}
		else{
			int a = factorial(n)/(factorial(r)*factorial(n-r));
			System.out.println("There are "+a+" ways of choosing "+r+" items from "+n+" choices");
		}
		
	}
}
