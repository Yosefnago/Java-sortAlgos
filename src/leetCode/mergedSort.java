package leetCode;

import java.util.Random;

public class mergedSort {
	
	
	private static int count = 0;
	public static void main(String[] args) {

	    Random rand = new Random();
	    count++;
	    int[] numbers = new int[10];
	    count++;
	    for (int i = 0; i < numbers.length; i++) {
	    	count++;
	      numbers[i] = rand.nextInt(10);
	    }
	    

	    System.out.println("Before:");
	    count++;
	    printArray(numbers);
	    count++;
	    mergedSort(numbers); 
	    count++;
	    System.out.println("\nAfter:");
	    count++;
	    printArray(numbers);
	    count++;
	    System.out.println("Number of count : " + count);
	  }
	
	public static void mergedSort(int [] arr) {
		count++;
		int inputLenght = arr.length;
		count++;
		if(inputLenght < 2) {
			count++;
			return ;
		}
		count++;
		int mid = arr.length/2;
		count++;
		int []leftHalf = new int[mid];
		count++;
		int []rightHalf = new int[arr.length-mid];
		count++;
		for(int i =0; i< mid ;i++) {
			count++;
			leftHalf[i] = arr[i];
		}
		for(int i =mid; i< arr.length ;i++) {
			count++;
			rightHalf[i - mid] = arr[i];
		}
		
		
		mergedSort(leftHalf);
		count++;
		mergedSort(rightHalf);
		count++;
		merge(arr,leftHalf,rightHalf);
		count++;
		
	}
	private static void merge(int []arr,int[] leftHalf,int [] rightHalf) {
		count++;
		int leftSize = leftHalf.length;
		count++;
		int rightSize = leftHalf.length;
		count++;
		int i = 0;
		count++;
		int j = 0;
		count++;
		int k = 0;
		count++;
		while(i < leftSize && j < rightSize) {
			count++;
			if(leftHalf[i] <= rightHalf[j]) {
				count++;
				arr[k] = leftHalf[i];
				count++;
				i++;
				count++;
			}else {
				count++;
				arr[k] = rightHalf[j];
				count++;
				j++;
				count++;
				
			}
			count++;
			k++;
		}
		count++;
		while(i < leftSize) {
			count++;
			arr[k] = leftHalf[i];
			count++;
			i++;
			count++;
			k++;
			count++;
		}
		while(j < rightSize) {
			count++;
			arr[k] = rightHalf[j];
			count++;
			j++;
			count++;
			k++;
			count++;
		}
		
		
	}
	private static void printArray(int[] numbers) {
		count++;
		for (int i = 0; i < numbers.length; i++) {
			count++;
			System.out.println(numbers[i]);
			count++;
	    }
	  }
	
}
