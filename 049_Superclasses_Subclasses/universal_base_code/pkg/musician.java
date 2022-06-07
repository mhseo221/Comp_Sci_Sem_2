package pkg;
import java.util.Scanner;
import java.util.Random;

public class musician extends performer{
	public String instrument;
	
	public musician(){
		instrument = "cello";
	}
	
	public musician(String instrument){
		this.instrument = instrument;
	}
	
	public String getInstrument(){
		return instrument;
	}
	
	public void playInstrument(){
		System.out.println(super.getName()+" playing the "+instrument);
	}
}

