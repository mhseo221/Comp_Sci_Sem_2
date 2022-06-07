import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below performer
		performer [] a = new performer[4];
		a[0] = new performer();
		a[0].perform();
		a[0].practice();
		
		a[1] = new musician();
		a[1].perform();
		((performer)a[1]).practice();
		
		a[2] = new apprentice();
		((apprentice)a[2]).practiceAtUniversity();
		((musician)a[2]).playInstrument();
		
		a[3] = new actor();
		((actor)a[3]).monologue();
		((performer)a[3]).perform();
		


		
	}
}
