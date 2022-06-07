import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void average(int [][] array){
		int c = 0;
		for(int i = 0; i<array.length;i++){
			for(int j = 0; j<array[0].length;j++){
				c+=array[i][j];
			}
		}
		System.out.println("average: "+c/(array.length*array[0].length));
	}
	
	public static void result(int [][] ar){
		for(int i = 0; i<ar.length; i++){
			for(int j = 0; j<ar[0].length; j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.print("Enter a number: ");
		int first = sc.nextInt();
		
		System.out.print("Enter a number: ");
		int second = sc.nextInt();
		

		
		int [][] arr = new int[first][second];
		for(int i = 0; i<first; i++){
			for(int j = 0; j<second; j++){
				arr[i][j]=rand.nextInt(9)+1;
			}
		}
		
		average(arr);
		result(arr);
		

		
	}
}
