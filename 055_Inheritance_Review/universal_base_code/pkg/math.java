package pkg;
import java.util.Scanner;
import java.util.Random;


public class math extends course{
	public String difficulty;
	
	public math(String teacher, int grade){
		super(teacher, grade);
	}
	public String toString(){
		return ("teacher: "+super.teacher+" / credit: "+super.credit);
	}
}

