package pkg;
import java.util.Scanner;
import java.util.Random;


public class APSci extends science{

	
	public APSci(String teacher, int grade){
		super(teacher, grade);
	}
	
	public void ap(){
		super.grade++;
	}
	public String toString(){
		return ("teacher: "+super.teacher+" / credit: "+super.credit);
	}
		
}

