package pkg;
import java.util.Scanner;
import java.util.Random;

public class designershirt extends clothes{
    String brand;
    
    public pants(double price, String producer, String brand){
		super(producer, price);
		this.brand = brand;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public String greetings(){
		System.out.println("Thank you so shopping for our designer shirts today");
	}
}