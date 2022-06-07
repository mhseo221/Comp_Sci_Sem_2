package pkg;
import java.util.Scanner;
import java.util.Random;


public class history extends course{
	public int era;
	
	
	public history(String teacher, int grade){
		super(teacher, grade);
	}
	public String toString(){
		return ("teacher: "+super.teacher+" / credit: "+super.credit);
	}
}

