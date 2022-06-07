import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf{
	String name;
	int age;
	
	public Dwarf(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean isSameName(String name){
		if(name.equals(this.name)){
			return true;
		}
		return false;
	}
	public String getName(){
		return name;
	}

}
class starter {

	public static void main(String args[]) {

		Random rand = new Random();
		Dwarf [] a = new Dwarf[100];
		String name;
		int age;
		int num;
		
		for(int i = 0; i<a.length; i++){
			num = rand.nextInt(6);
			if(num==0){
				name = "Grumpy";
			}
			else if(num==1){
			name = "Dopey";
			}
			else if(num==2){
				name = "Doc";
			}
			else if(num==3){
				name = "Happy";
			}
			else if(num==4){
				name = "Bashful";
			}
			else if(num==5){
				name = "Sneezy";
			}
			else{
				name = "Sleepy";
			}
			age = rand.nextInt(100);
			a[i] = new Dwarf(name,age);
		}	
		int c = 0;
		int counter = 0;
		while(c<100){
			if(a[0].getName().equals(a[c].getName())){
				counter++;
			}
			c++;
		}
		
		System.out.println("Number of duplicates: "+counter+" / Name: "+a[0].getName());
		
	}
}
