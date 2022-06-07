package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger{
	
	private int [] rateTable;
	public int total;
	public int min = 1000000;
	public int c;
	public int time=0;
	
	private int getChargingCost(int startHour, int chargeTime){
		for(int i = startHour; i<chargeTime-1; i++){
			if(i<=23){
				total += rateTable[i];
			}
			else{
				total += rateTable[i-23];
			}
		}
		return total;
	}
	
	public int getChargeStartTime(int chargeTime){
		if(chargeTime>23){
			chargeTime -= 23;
		}
		for(int a = 23; a>chargeTime; a--){
			c -= rateTable[a];
			if(c<min){
				min = c;
				time++;
			}
			return 23-time;
		}
	}
}

