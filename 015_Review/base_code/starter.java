import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String character = sc.nextLine();
		
		
		if(character.equals("Wizard")){
			System.out.println("You've choosen the Wizard! Excelsior!");
		}
		else if(character.equals("wizard")){
			System.out.println("You've choosen the Wizard! Excelsior!");
		}
		else if(character.equals("Warrior")){
			System.out.println("You've choosen the Warrior! For Honor!");
		}
		else if(character.equals("warrior")){
			System.out.println("You've choosen the Warrior! For Honor!");
		}
		else if(character.equals("Rogue")){
			System.out.println("You've choosen the Rogue! How cunning!");
		}
		else if(character.equals("rogue")){
			System.out.println("You've choosen the Rogue! How cunning!");
		}
		else
			System.out.println("You've decided not to choose a role. Rerun the program.");
		
		
		System.out.println("");
		
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if(strength>10){
			System.out.println("Please input a smaller value. Strength (1-10): ");
			strength = sc.nextInt();
		}
		int total = 25-strength;
		System.out.println("You have "+total+" left to spend.");
		System.out.println("");
		
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if(dexterity>10){
			System.out.println("Please input a smaller value. Dexterity (1-10): ");
			dexterity = sc.nextInt();
		}
		int total2 = total-dexterity;
		System.out.println("You have "+total2+" left to spend.");
		System.out.println("");
		
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if(intelligence>10){
			System.out.println("Please input a smaller value. Intelligence (1-10): ");
			intelligence = sc.nextInt();	
		}
		int total3 = total2-intelligence;
		System.out.println("You have "+total3+" left to spend.");
		System.out.println("");
		
		System.out.print("Constitution (1-10): ");
		int constitution = sc.nextInt();
		if(constitution>10){
			System.out.println("Please input a smaller value. Constitution (1-10): ");
			constitution = sc.nextInt();
		}
		int total4 = total3-constitution;
		System.out.println("You have "+total4+" left to spend.");
		System.out.println("");
		
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if(charisma>10){
			System.out.println("Please input a smaller value. Charisma (1-10): ");
			charisma = sc.nextInt();
		}
		int total5 = total4-charisma;
		System.out.println("You have "+total5+" to spend for next time");
		
		System.out.println("________________________________________________________________");
		
		System.out.println("You are "+name+", the "+title+" of CVHS.");
		System.out.println("You're a "+character+" with the following stats!");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intelligence);
		System.out.println("Constitution - "+constitution);
		
		System.out.println("");
		
		System.out.println("Good luck on you quest "+name+"!");
		
	}
}
