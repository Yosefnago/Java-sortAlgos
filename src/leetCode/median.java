package leetCode;

import java.util.Arrays;

//Median of two sorted array O(log(m+n));
public class median {
	
	public static void main(String[] args) {
	
		int []a = {1,2,3,4};
		int []b = {1,3,5,6};
		
		
	}
	public static void sort(int []a,int []b) {
		
		int []c = new int[a.length+b.length];
		
		Arrays.sort(c);
		int l =0;
		int t = 0;
		int i  =0;
		while(i < c.length ) {
			
			if(a[l] <= b[t]) {
				c[i] = a[l];
				l++;
				i++;
			}else {
				c[i] = b[t];
				t++;
				i++;
			}
			
			System.out.println(c[i]);
		}
		
		
		
		
	}

}
