import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	
	public static void main(String args[]) {
		Warrior warrior = new Warrior();
		System.out.println("This is "+warrior.getName());
		Wizard wizard = new Wizard();
		System.out.println("This is "+wizard.getName());
		Ranger ranger = new Ranger();
		System.out.println("This is "+ranger.getName());


		
	}
}
