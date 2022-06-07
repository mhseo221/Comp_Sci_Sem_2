package pkg;

public class Robot{
	private int [] hall;
	private int pos;
	private boolean facingRight;
	int c = 0;
	
	private boolean fowardMoveBlocked(){
		if(facingRight==true&&pos==hall.length-1){
			return true;
		}
		else if(facingRight==false&&pos==0){
			return true;
		}
		else
			return false;
	}
	
	private void move(){
		if(hall[pos]>0){
			hall[pos]--;
		}
		else{
			if(facingRight&&hall[pos].fowardMoveBlocked()){
				facingRight = false;
			}
			else if(facingRight==false&&hall[pos].fowardMoveBlocked()){
				facingRight = true;
			}
			else if(facingRight){
				pos++;
			}
			else if(facingRight==false){
				pos--;
			}
				
		}
		c++;
	}
	
	public int clearHall(){
		for(int i = 0; i<hall.length; i++){
			if(hall[i]==0){
				return c;
			}
		}
	}
	
	private boolean hallIsClear(){
		for(int i = 0; i<hall.length; i++){
			if(hall[i]==0){
				return true;
			}
			return false;
		}
	}
}