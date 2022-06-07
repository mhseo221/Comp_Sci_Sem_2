package pkg;
import java.util.Scanner;
import java.util.Random;

public class socks extends clothes{
    String types;
    
    public socks(double price, String producer, String types){
        super(producer, price);
        this.types = types;
    }
    
    public String getTypes(){
        return types;
    }
    
    public String greetings(){
		System.out.println("Thank you so shopping for our socks today");
	}
    
}