import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
	Ascii a = new Ascii();
	a.printArt();
	

	Ascii b = new Ascii("other");
	b.setType("other");
	b.printArt();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a type (human, dog, cactus, tree, or other): ");
	String type2 = sc.nextLine();
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	sc.nextLine();
	Ascii c = new Ascii(type2,number);
	c.printArt();

	System.out.print("Enter a type (human, dog, cactus, or other): ");
	String type3 = sc.nextLine();
	System.out.print("Enter a number: ");
	int number2 = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter a name: ");
	String name = sc.nextLine();
	Ascii d = new Ascii(type3,name,number2);
	d.setType(type3);
	d.setName(name);
	d.setNumber(number2);
	d.printArt();

	}
}
