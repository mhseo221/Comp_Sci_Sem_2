package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;	

	public myCharacter(){
		role = "no role";
		System.out.println("Your role is "+role);
		strength = 0;
		System.out.println("Your strength trait is "+strength);
		dexterity = 0;
		System.out.println("Your dexterity trait is "+dexterity);
		intelligence = 0;
		System.out.println("Your intelligence trait is "+intelligence);
		constitution = 0;
		System.out.println("Your constitution trait is "+constitution);
		charisma = 0;
		System.out.println("Your charisma trait is "+charisma);
		System.out.println("----------------------------------------------------");

	}
	public myCharacter(String role){
		strength = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
		
		if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior")||role.equals("warrior")){
			System.out.println("You've chose the Warrior! For honor!");
		}
		else if(role.equals("Rogue")||role.equals("rogue")){
			System.out.println("You chose Rogue! How cunning!");
		}
		else{
			role = "no role";
		}
		System.out.println("Your role is"+role);
		System.out.println("Your role is "+role);
		strength = 0;
		System.out.println("Your strength trait is "+strength);
		dexterity = 0;
		System.out.println("Your dexterity trait is "+dexterity);
		intelligence = 0;
		System.out.println("Your intelligence trait is "+intelligence);
		constitution = 0;
		System.out.println("Your constitution trait is "+constitution);
		charisma = 0;
		System.out.println("Your charisma trait is "+charisma);
	}
}



