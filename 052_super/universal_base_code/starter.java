import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		apprentice a = new apprentice();
		a.playInstrument();
		
		apprentice b = new apprentice("cv", 2);
		b.practice();
		
		apprentice c = new apprentice("flute", "cv", 6);
		c.perform();
		
		apprentice d = new apprentice("violin", "CV", 4, "mai", 19);
		d.practiceAtUniversity();

		
	}
}
