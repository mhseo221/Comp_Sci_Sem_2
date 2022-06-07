import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Enter a sentence. ");
		Scanner sc = new Scanner(System.in);
		String sen = sc.nextLine();
		
		String [] a = new String[sen.length()];
		for(int i = 0; i<sen.length(); i++){
			a[i]=sen.substring(i,i+1);
		}
		
		int c = sen.length()-1; 
		while(c>=0){
			if(a[c].equals(" ")){
				System.out.print(sen.substring(c+1)+" ");
			}
			c--;
		}
	}
}