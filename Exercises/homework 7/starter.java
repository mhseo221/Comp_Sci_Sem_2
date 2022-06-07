import java.util.Random;
import java.util.Scanner;

class dog{
	
	String name;
	int age;
	String breed;
	
	public dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
		System.out.println(name+" is a "+breed+" that is "+age+" years old!");
	}
	public dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
		System.out.println(name+" is a "+breed+" that is "+age+" years old!");
	}
	public dog(String b, String c){
		name = b;
		age = 1;
		breed =c;
		System.out.println(name+" is a "+breed+" that is "+age+" years old!");
	}
	public dog(String d, int e){
		name = d;
		age = e;
		breed = "dog dog";
		System.out.println(name+" is a "+breed+" that is "+age+" years old!");
	}
	public void setName(String f){
		name = f;
	}
	public void setAge(int g){
		age = g;
	}
	public void setBreed(String h){
		breed = h;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public static boolean isSleeping(){
		Random rand = new Random();
		int x = rand.nextInt(1);
		if(x==0){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name +" barks!");
	}
}
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String x = sc.nextLine();
		System.out.println("What age should "+x+" be?");
		int y = sc.nextInt();
		dog bob = new dog(x,y);
		dog sky = new dog();
		
		if(bob.isSleeping()==true){
			System.out.println(x+" is asleep");
		}
		else{
			bob.bark();
		}
		
		if(bob.isSleeping()==true&&sky.isSleeping()==false){
			sky.bark();
		}
		if(bob.isSleeping()==true&&sky.isSleeping()==true){
			sky.bark();
		}

	}
}
