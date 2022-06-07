package pkg;
import java.util.Scanner;
import java.util.Random;


public class actor extends performer{
	String type;
	
	public actor(){
		type = "theater";
	}
	
	public actor(String name, String type){
		this.type = type;
		name = super.getName();
	}
	
	public void practice(){
		System.out.println(super.getName() + " is practicing the play");
	}
	
	public void perform(){
		System.out.println(super.getName() + " is performing the play");
	}
	
	public void monologue(){
		System.out.println("Your patient is your power");
	}
}

