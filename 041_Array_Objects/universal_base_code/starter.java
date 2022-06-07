import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		int left = 0;
		int counter1=0;
		int counter2=0;
		Wizard[] a = new Wizard[100];
		Warrior[] b = new Warrior[100];
		
		for(int i = 0; i<a.length; i++){
			a[i] = new Wizard();
			b[i] = new Warrior();
		}
		
		while(counter1<=99||counter2<=99){

			a[counter1].attack(b[counter2]);
			
			if(b[counter2].isDead()){
				counter2++;
			}

			b[counter2].attack(a[counter1]);
			
			if(a[counter1].isDead()){
				counter1++;
			}
			if(a[99].isDead()){
				left = 100 - counter2;
				System.out.println("Warrior has won with "+ left +" left in their army");
				break;
			}
			if(b[99].isDead()){
				left = 100 - counter1;
				System.out.println("Wizard has won with "+left+" left in their army");
				break;
			}

			
		}
		
	}
}
