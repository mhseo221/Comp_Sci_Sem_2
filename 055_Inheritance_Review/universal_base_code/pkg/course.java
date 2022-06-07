package pkg;
import java.util.Scanner;
import java.util.Random;


public class course{
	public String teacher;
	public int grade;
	public int credit;
	
	public course(String teacher, int grade){
		this.teacher = teacher;
		this.grade = grade;
	}
	
	public int calcCredit(){
		if(grade>=90){
			credit = 4;
		}
		else if(grade>=80){
			credit = 3;
		}
		else if(grade>=70){
			credit = 2; 
		}
		else if(grade>=60){
			credit = 1;
		}
		else{
			credit = 0;
		}
		return credit;
	}
	
	public boolean equals(Object other){
		return this.teacher == ((course)other).teacher;
	}
	
	public String toString(){
		return ("teacher: "+teacher+" / credit: "+credit);
	}
}

