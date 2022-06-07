import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		performer a = new performer();
		performer b = new performer("Mary", 23);
		
		musician c = new musician();
		musician d = new musician("flute");
		
		a.getName();
		a.practice();
		
		b.getName();
		b.perform();
		
		c.getName();
		c.perform();
		c.playInstrument();
		
		d.practice();
		d.getInstrument();
		

		
	}
}
