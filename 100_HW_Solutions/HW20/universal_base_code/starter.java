import java.util. *;

class starter {
	
	public static void bub(ArrayList <Integer> a){
		for(int outer = 0; outer<a.size()-1; outer++){
			for(int inner = 0; inner<a.size()-outer-1; inner++){
				if(a.get(inner)>a.get(inner+1)){
					int temp = a.get(inner);
					a.set(inner, a.get(inner+1));
					a.set(inner+1, temp);
				}
			}
		}
		System.out.println(a);
	}
	
	public static void sel(ArrayList <Integer> b){
		int outer, inner, min_index;
		
		for(outer = 0; outer < b.size(); outer++){
			min_index = outer;
			for(inner = outer+1; inner < b.size(); inner++){
				if(b.get(inner) < b.get(min_index)){
					min_index = inner;
				}
			}
			int temp = b.get(outer);
			b.set(outer, b.get(min_index));
			b.set(min_index, temp);
		}
		System.out.println(b);
	}
	
	public static void ins(ArrayList <Integer> c){
		int outer, inner, key;
		
		for(outer = 1; outer < c.size(); outer++){
			key = c.get(outer);
			inner = outer - 1;
			
			while(inner >= 0 && c.get(inner) > key){
				c.set(inner+1, c.get(inner));
				inner --;
			}
			c.set(inner+1, key);
		}
		System.out.println(c);
	}
	public static void main(String args[]) {
		ArrayList <Integer> a = new ArrayList <Integer>();
		for(int i = 0; i<100; i++){
			a.add((int)(100*Math.random())+1);
		}
		
		ArrayList <Integer> b = new ArrayList <Integer>();
		for(int i = 0; i<100; i++){
			b.add(a.get(i));
		}
		
		ArrayList <Integer> c = new ArrayList <Integer>();
		for(int i = 0; i<100; i++){
			c.add(a.get(i));
		}
		
		System.out.println(a);
		System.out.println();
		System.out.println();
		bub(a);
		System.out.println();
		System.out.println();
		sel(b);
		System.out.println();
		System.out.println();
		ins(c);
	}
}
