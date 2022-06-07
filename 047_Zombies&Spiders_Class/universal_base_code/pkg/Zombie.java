import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Zombie implements Creature{
	Random rand = new Random();
	public String name;
	public int health;
	public int attack;
	
	public Zombie(){
		this.name = "Zack";
		this.health = rand.nextInt(6)+5;
		this.attack = rand.nextInt(6)+5;
	}
	
	public boolean isDead(){
		if(health<=0){
			return true;
		}
		return false;
	}
	
	public boolean takeDamage(int a){
		int b = health - a;
		if (b<=0){
			return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean attack(Creature c){
		if(health<=0){
			return true;
		}
		return false;
	}
	
	public String greeting(){
		System.out.print("I am a zombie");
	}
	
}
