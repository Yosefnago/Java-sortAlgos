package leetCode;

import java.util.Random;

public class mergedSort {
	
	
	public static void main(String[] args) {

	    Random rand = new Random();
	   
	    int[] numbers = new int[10];
	    
	    for (int i = 0; i < numbers.length; i++) {
	    	
	      numbers[i] = rand.nextInt(10);
	    }
	    

	    System.out.println("Before:");
	   
	    printArray(numbers);
	    
	    mergedSort(numbers); 
	    
	    System.out.println("\nAfter:");
	    
	    printArray(numbers);
	    
	    System.out.println("Number of count : " + count);
	  }
	
	public static void mergedSort(int [] arr) {
		
		int inputLenght = arr.length;
		
		if(inputLenght < 2) {
			
			return ;
		}
		count++;
		int mid = arr.length/2;
		
		int []leftHalf = new int[mid];
		
		int []rightHalf = new int[arr.length-mid];
		
		for(int i =0; i< mid ;i++) {
			
			leftHalf[i] = arr[i];
		}
		for(int i =mid; i< arr.length ;i++) {
			
			rightHalf[i - mid] = arr[i];
		}
		
		
		mergedSort(leftHalf);
		
		mergedSort(rightHalf);
		
		merge(arr,leftHalf,rightHalf);
		
		
	}
	private static void merge(int []arr,int[] leftHalf,int [] rightHalf) {
		
		int leftSize = leftHalf.length;
		
		int rightSize = leftHalf.length;
		
		int i = 0;
		
		int j = 0;
		
		int k = 0;
		
		while(i < leftSize && j < rightSize) {
			
			if(leftHalf[i] <= rightHalf[j]) {
				
				arr[k] = leftHalf[i];
				
				i++;
				
			}else {
				
				arr[k] = rightHalf[j];
				
				j++;
				
				
			}
			
			k++;
		}
	
		while(i < leftSize) {
			
			arr[k] = leftHalf[i];
			
			i++;
			
			k++;
			
		}
		while(j < rightSize) {
			
			arr[k] = rightHalf[j];
			
			j++;
			
			k++;
			
		}
		
		
	}
	private static void printArray(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
			
	    }
	  }
	
}
