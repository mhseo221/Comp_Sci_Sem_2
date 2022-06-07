package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;	

	public myCharacter(){
		role = "no role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public myCharacter(String a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a role (wizard, warrior, or rougue)");
		a = sc.nextLine();
		role = a;
		strength = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0;
	}
	public void myToString(){
		System.out.println("Your role is "+role);
		System.out.println("Your strength trait is "+strength);
		System.out.println("Your dexeterity train is "+dexterity);
		System.out.println("Your intelligence trait is "+intelligence);
		System.out.println("Your constitution trait is "+constitution);
		System.out.println("Your charisma trait is "+charisma);
	}
	public String setRole(String b){
		if(b.equals("wizard")||b.equals("Wizard")){
			role = "Wizard";
			System.out.println("You've choosen the Wizard! Excelsior!");
		}
		else if(b.equals("warrior")||b.equals("Warrior")){
			role = "Warrior";
			System.out.println("You've choosen the Warrior! For Honor!");
		}
		else if(b.equals("rogue")||b.equals("Rogue")){
			role = "Rogue";
			System.out.println("You've choosen the Rogue! How cunning!");
		}
		else{
			role = "no role";
		}
		return role;
	}
	public int setStrength(int s){
		s = strength;
		return s;
	}
	public int setDexterity(int d){
		d = dexterity;
		return d;
	}
	public int setIntelligence(int i){
		i = intelligence;
		return i;
	}
	public int setConstitution(int co){
		co = constitution;
		return co;
	}
	public int setCharisma(int ch){
		ch = charisma;
		return ch;
	}
	public boolean setAll(String c, int e, int f, int g, int h, int j){
		return true;
	}
}



