package leetCode;

public class Ksearch {
	
	public static void main(String[] args) {
		int []arr = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0};
		System.out.println(search(arr,19));
	}
	
	
	public static int search(int []a,int target) {
		
		int low = 0;
		int top = a.length-1;
		
		
		while(low <= top) {
			int mid =(low+top)/2;
			
			
			if(a[mid] == target) {
				return mid;
			}
			if(a[mid] == 0) {
				while(a[mid] == 0 && mid >= low ) {
					mid--;
					if(a[mid] == target) {
						return mid;
					}else if(a[mid] > target) {
						mid = (low+top)/2;
						while(a[mid] == 0 && mid <= top) {
							mid++;
							if(a[mid] == target) {
								return mid;
							}
						}
					}
				}
			}
			
			if(a[mid] > target) {
				low = mid + 1;
			}else {
				top = mid - 1;
			}
			
		}
		
		return -1;
		
	}
	
	
	
}
