import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class implements CombinedTable{
	int seat = 0;
	double desirability = 0.0;
	double height = 0.0;
	
	public CombinedTable(SingleTable a, SingleTable b){
		seat = (a.getNumSeats+b.getNumSeats)-1;
		desirability = (a.getHeight()+b.getHeight())/2;
	}
	
	public boolean canSeat(int a, int b, int people{
		seats = (a.getNumSeats()+b.getNumSeats())-2;
		if(seats>= people){
			return true;
		}
		return false;
	}
	
	public double getDesirability(SingleTable a, SingleTable b){
		desirability = a.getHeight()+b.getHeight())/2;
		return desirability; 
	}
	
	
}
