
import java.util.Scanner;
import java.util.Random;


class character{
	String a = new String("Wizard");
	String b = new String("Rogue");
	String c = new String("Warrior");
	int s = 4;
	int d = 2;
	int i = 7;
	int co = 9;
	int ch = 3;	

}
class starter{
    public static void main(String args[]) {
		// Your code goes below here
    character chara = new character();
    System.out.println("Your role is  "+chara.a);
    System.out.println("Your strength trait is "+chara.s);
    System.out.println("Your dexterity trait is "+chara.d);
    System.out.println("Your intelligence trait is "+chara.i);
    System.out.println("Your constitution trait is "+chara.co);
    System.out.println("Your charisma trait is "+chara.ch);
    }

}