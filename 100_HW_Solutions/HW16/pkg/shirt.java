package pkg;
import java.util.Scanner;
import java.util.Random;

public class shirt extends clothes{
    String material;
    
    public shirt(double price, String producer, String materiale){
        super(producer, price);
        this.material = material;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public String greetings(){
		System.out.println("Thank you so shopping for our shirts today");
	}
}