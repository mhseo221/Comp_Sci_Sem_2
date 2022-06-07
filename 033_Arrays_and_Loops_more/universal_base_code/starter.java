import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		sc.nextLine();
		int [] a = new int[size];
		Random rand = new Random();
		for(int i = 0; i<a.length; i++){
			a[i]=rand.nextInt(99)+1;
			System.out.println(a[i]);
		}
		System.out.println();
		int min = 1000;
		int c = 0;
		while(c<a.length){
			if(a[c]<min){
				min = a[c];
			}
			c++;
		}
		System.out.println("min = "+min);
		
		int max = 0;
		c = a.length-1;
		while(c>=0){
			if(a[c]>max){
				max = a[c];
			}
			c--;
		}
		System.out.println("max = "+max);
		
		c=0;
		int d = 0;
		while(c<a.length){
			d = d + a[c];
			c++;
		}
		
		System.out.println("average = "+(d/a.length));


		
	}
}
