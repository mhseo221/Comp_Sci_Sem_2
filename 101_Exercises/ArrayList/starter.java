import java.util.*;

class starter {
	//Methods go here
	public static void printArrayList(ArrayList <Integer> a){
		for(int i = 0; i<a.size(); i++){
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void addValuesArrayList(ArrayList <Integer> b, int val){
		Random rand = new Random();
		for(int i = 0; i<val; i++){
			b.add(i,rand.nextInt(99)+1);
		} 
		
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		addValuesArrayList(arr,a);
		printArrayList(arr);

	}
}
