package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ranger{
		Random rand = new Random();
		String name;
		int health = rand.nextInt(14)+1;
		int attack = rand.nextInt(14)+1;
		int a;
		
		public Ranger(){
			this.name = "";
			this.health = health;
			this.attack = attack;
		}
		public Ranger(String name, int health, int attack){
			this.name = "Ranger";
			this.health = health;
			this.attack = attack;
		}
		
		public void setHealth(int health){
			this.health = health;
		}
		
		public int getHealth(){
			return health;
		}
		
		public String getName(){
			return name;
		}
		
		public void attack(Warrior w){
			a = rand.nextInt(attack)+1;
			w.setHealth(w.getHealth()-a);
		}
		
		public void attack(Wizard w){
			a = rand.nextInt(attack)+1;
			w.setHealth(w.getHealth()-a);

		}	
	}