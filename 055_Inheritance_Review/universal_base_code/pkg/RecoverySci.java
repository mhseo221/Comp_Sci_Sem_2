package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends science{
	
	public RecoverySci(String teacher, int grade){
		super(teacher, grade);
	}
		
	public void pass(){
		if(super.grade>60){
			super.credit = 4;
		}
		else{
			super.credit = 0;
		}
	}
	
	public String toString(){
		return ("teacher: "+super.teacher+" / credit: "+super.credit);
	}
	
}

