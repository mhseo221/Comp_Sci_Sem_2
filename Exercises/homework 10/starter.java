import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		int [] a = new int[20];
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		for(int i = 0; i<a.length; i++){
			a[i]=rand.nextInt(9)+1;
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		int target = rand.nextInt(9)+1;
		System.out.println("target = "+target);
		
		int c = 0;
		for(int j = 0; j<a.length; j++){
			if(a[j]==target){
				System.out.println("index # = "+j);
				c++;
			}
		}
		System.out.println("number of index = "+c);
		System.out.println();
		System.out.println("consecutive numbers:");
	
		for(int k = 0; k<a.length-1; k++){
			if(a[k]==a[k+1]){
				System.out.print("index #s = "+k+","+(k+1));
				System.out.println("  number = "+a[k]);
			}
		}
	
	}
}
