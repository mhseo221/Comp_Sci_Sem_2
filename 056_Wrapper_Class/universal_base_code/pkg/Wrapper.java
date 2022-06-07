package pkg;
import java.util.Scanner;
import java.util.Random;


public class Wrapper {
	public Integer a;
	public Double b;
	public Character c;
	
	public Wrapper(Integer a, Double b, Character c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String toString(){
		return ("int = "+a+" / double = "+b+" / character = "+c);	
	}
}

