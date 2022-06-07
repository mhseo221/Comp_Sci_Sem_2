import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		course [] a = new course[6];
		
		a[0] = new course("Mr.Poole",91);
		a[0].calcCredit();
		System.out.println(a[0].toString());
		
		a[1] = new science("Ms.Patton", 89);
		a[1].calcCredit();
		System.out.println(a[1].toString());

		a[2] = new RecoverySci("Dr.Platt", 98);
		a[2].calcCredit();
		System.out.println(a[2].toString());
		
		a[3] = new APSci("Mr.Hart",86);
		a[3].calcCredit();
		((APSci)a[3]).ap();
		System.out.println(a[3].toString());
		
		a[4] = new math("Mr.G", 85);
		a[4].calcCredit();
		System.out.println(a[4].toString());
		
		a[5] = new history("Ms.M", 98);
		a[5].calcCredit();
		System.out.println(a[5].toString());
		
		int c = 0;
		for(int i = 0; i<a.length; i++){
			a[i].equals(a[c]);
				c++;
		}		
	}
}
