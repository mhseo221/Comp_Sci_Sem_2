import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Creature a = new Spider();
		Creature b = new Zombie();
		Role c = new Ranger();
		
		if(c.getHealth>=0){
			c.attack(a);
			a.takeDamage();
		}
		
		if(c.isDead()){
			System.out.println("Spider is dead");
		}
		
		if(b.getHealth>=0){
			c.attack(b);
			b.takeDamage();
		}
		
		if(b.isDead()){
			System.out.println("Zombie is dead");
		}
		
	}
}
