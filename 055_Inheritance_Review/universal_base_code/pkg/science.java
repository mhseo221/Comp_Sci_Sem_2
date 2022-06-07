package pkg;
import java.util.Scanner;
import java.util.Random;


public class science extends course{
	public String field;
	
	public science(String teacher, int grade){
		super(teacher, grade);
	}

	public String toString(){
		return ("teacher: "+super.teacher+" / credit: "+super.credit);
	}
}

