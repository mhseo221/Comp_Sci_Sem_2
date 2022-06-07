import pkg.*;
import java.util.Scanner;
import java.util.Random;

class Dwarf{
	String name;
	int age;
	
	public Dwarf(){
		name = "";
		age = 0;
	}
	
	public Dwarf(String a, int b){
		name = a;
		age = b;
	}
	
	public String getname(){
		return name;
	}
	
	public int getage(){
		return age;
	}
	
}
class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		String name;
		int age;
		
		Dwarf [] a = new Dwarf[100];
		for(int i = 0; i<a.length; i++){
			
			int num = rand.nextInt(6);
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
			
			age = rand.nextInt(99)+1;
			
			a[i] = new Dwarf(name,age);
		}
		
		for(int j = 0; j < a.length; j++){
			System.out.println("Name: "+a[j].getname()+" / Age: "+a[j].getage());
		}


		
	}
}
