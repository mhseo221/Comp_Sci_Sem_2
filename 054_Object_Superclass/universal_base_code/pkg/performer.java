package pkg;
import java.util.Scanner;
import java.util.Random;


public class performer{
	public String name;
	public int age;
	
	public performer(){
		name = "Doja Cat";
		age = 26;
	}
	
	public performer(String a, int b){
		name = a;
		age = b;
	}
	
	public String getName(){
		return name;
	}
	
	public void practice(){
		System.out.println(name + " is practicing");
	}
	
	public void perform(){
		System.out.println(name + " is performing");
	}
	
	public boolean equals(Object other){
		return this.name == ((performer)other).getName();
	}
	
	public String toString(){
		return("Name: "+name+" / Age: "+age);
	}
}

