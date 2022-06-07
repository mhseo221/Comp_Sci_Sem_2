import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int getMode(int [] a){
		int c1 = 0;
		int c2 = 0;
		int ans;
		for(int i = 0; i<a.length();i++){
			for(int j = 0; j<length();j++){
				if(a[i]==a[j]){
					c1++;
				}
				
			}
			if(c1>c2){
				c2 = c1;
				ans = a[i];
			}
		}
		if(c1!=c2){
			return c2;
		}
		else{
			return -1;
		}
		
		
	}
	public static double getMedian(int [] b){
		int num = b.length()/2;
		if(num%0==0){
			return (b[num-1]+b[num])/2;
		}
		else{
			return b[num];
		}
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		int mode1 = getMode(arr1);		//The value of mode1 is 5.
		int mode2 = getMode(arr2);		//The value of mode2 is 7
		int mode3 = getMode(arr3);		// The value of mode3 is -1.

		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		int median1 = getMedian(arr4);  	//The value of median1 is 4.
		int median2 = getMedian(arr5);	//The value of median2 is 3.
		
	}
}
