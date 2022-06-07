package pkg;
import java.util.Scanner;
import java.util.Random;

public class pants extends clothes{
	int length;

	public pants(double price, String producer, int length){
		super(producer, price);
		this.length=length;
	}
	
	public int getLength(){
		return length;
	}
	
	public String greetings(){
		System.out.println("Thank you so shopping for our pants today");
	}
}