import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and last name with a space in the middle.");
		String name = sc.nextLine();
		System.out.print("The last name is:");
		String [] a = new String[name.length()];
		for(int i = 0; i < name.length(); i++){
			a[i]=name.substring(i,i+1);
				if(a[i].equals(" ")){
					System.out.print(name.substring(i,name.length()));
				}
		}


		
	}
}
