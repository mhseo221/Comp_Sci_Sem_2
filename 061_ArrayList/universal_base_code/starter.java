import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util. *;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int a = sc.nextInt();
		
		ArrayList <String> arr = new ArrayList <String>();
		for(int i =0; i<a; i++){
			arr.add("cookies");

		}
		System.out.println(arr);
	}
}
