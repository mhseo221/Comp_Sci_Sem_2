
import java.util.*;

class starter {
	public static void removeDup(ArrayList <Integer> arr){
		
		for(int i = 0; i<arr.size(); i++){
			for(int j = i+1; j<arr.size(); j++){
				if(arr.get(i)==arr.get(j)){
					arr.remove(j);
					j--;
				}
			}
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);
		System.out.println();
		System.out.println();//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
