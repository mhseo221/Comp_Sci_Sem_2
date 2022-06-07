import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		performer [] a = new performer[4];
		a[0]= new performer();
		a[0].toString();
		
		a[1]= new musician();
		a[1].toString();
		
		a[2]= new actor();
		a[2].toString();
		
		a[3]= new apprentice();
		a[3].toString();
		
		int c = 0;
		for(int i = 0; i<a.length; i++){
			a[i].equals(a[c]);
			c++;
		}

		
	}
}
