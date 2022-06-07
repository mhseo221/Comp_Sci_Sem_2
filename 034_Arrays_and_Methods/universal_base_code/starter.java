import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int [] a){
		for(int i = 0; i<a.length; i++){
			Random rand = new Random();
			a[i]=rand.nextInt(10);
			System.out.println(a[i]);
		}
		return;
	}
	public static int getArrayAverage(int [] b){
		int c = 0;
		for(int j = 0; j<b.length; j++){
			c = c + b[j];
		}
		int average = c/b.length;
		
		return average;
	}
	public static int getArrayMax(int [] c){
		int count = 0;
		int max = 0;
		while(count<c.length){
			if(c[count]>max){
				max = c[count];
			}
			count++;
		}
		return max;
	}
	public static int getArrayMin(int [] d){
		int min=1000;
		for(int k = 0; k<d.length; k++){
			if(d[k]<min){
				min = d[k];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int ans = sc.nextInt();
		sc.nextLine();
		
		int [] x = new int[ans];
		toStringArray(x);
		System.out.println("average = "+getArrayAverage(x));
		System.out.println("maximum = "+getArrayMax(x));
		System.out.println("minimum = "+getArrayMin(x));
		
	}
}
