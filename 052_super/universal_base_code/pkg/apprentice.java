package pkg;
import java.util.Scanner;
import java.util.Random;


public class apprentice extends musician{
	String school;
	int yearsOfExperience;
	
	public apprentice(){
		school = "CVHS";
		yearsOfExperience = 0;
	}
	
	
	public apprentice(String school, int yearsOfExperience){
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public apprentice(String instrument, String school, int yearsOfExperience){
		instrument = super.instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public apprentice(String instrument, String school, int yearsOfExperience, String a, int b){
		instrument = super.instrument;
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
		super.name = a;
		super.age = b;
		
	}
	
	public void playInstrument(){
		System.out.println(super.getName()+" is playing an instrument");
	}
	
	public void practice(){
		System.out.println(super.getName()+" has been practicing for "+yearsOfExperience+" years");
	}
	
	public void perform(){
		System.out.println(super.getName()+" is performing right now");
	}
	
	public void practiceAtUniversity(){
		System.out.println(super.getName()+" is practicing at "+school);
	}
	
	public void toString(){
		System.out.println("Name: "+super.getName());
		System.out.println("instrument: "+super.getInstrument());
		System.out.println("university: "+school);
	}
	
	public String toString(){
		return("Name: "+super.getName()+" / Instrument: "+getInstrument()+ " / university: "+school);
	}
}

