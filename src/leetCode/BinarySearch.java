package leetCode;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Welcome to BinarySearch");
		System.out.println("");
		System.out.println("");
		
		
		int [] a = new int[19999999];
		int number = 1;
		
		for(int i = 0;i<a.length;i++) {
			a[i] = number;
			number = number + 5;
		}
		
		
		
		long startTime = System.currentTimeMillis();
		
		binarySearch(a,89012341);
		long endTime = System.currentTimeMillis();
		System.out.println("Runtime " + ( endTime - startTime));
		
		
		
	}
	
	public static void binarySearch(int[] arr, int target) {
		int low = 0;
		int top = arr.length-1;
		
		while(low <= top) {
			int mid = (low + top)/2;
			
			
			if(arr[mid] == target) {
				System.out.println("Found at index : "+mid);
				
			}
			
			
			if(arr[mid] < target) {
				low = mid + 1;
			}else {
				top = mid - 1;
			}
			
			
		}
		// If the target does not exist return -1;
	}

}
