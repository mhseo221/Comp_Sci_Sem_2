import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util. *;

class starter {
	public static void toStringArrayList(ArrayList<Integer> arr, int a){
		Random rand = new Random();
		for(int i = 0; i<a; i++){
			arr.add(rand.nextInt(99)+1);
		}
		System.out.println(arr);
	}
	public static Integer getArrayListAverage(ArrayList<Integer> arr2){
		int c = 0;
		for(int i = 0; i<arr2.size(); i++){
			c += arr2.get(i);
		}
		return c/arr2.size();
	}
	public static Integer getArrayListMax(ArrayList<Integer> arr3){
		int max = 0;
		for(int i = 0; i<arr3.size(); i++){
			if(max<arr3.get(i)){
				max = arr3.get(i);
			}
		}
		return max;
	}
	public static Integer getArrayListMin(ArrayList<Integer> arr4){
		int min = 101;
		for(int i = 0; i<arr4.size(); i++){
			if(i<min){
				min = arr4.get(i);
			}
		}
		return min;
	}
	public static void main(String args[]) {
		// Your code goes below here
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 100: ");
		int a = sc.nextInt();
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		toStringArrayList(arr,a);
		System.out.println("max: "+getArrayListMax(arr));
		System.out.println("min: "+getArrayListMin(arr));
		System.out.println("avg: "+getArrayListAverage(arr));
		
	}
}
