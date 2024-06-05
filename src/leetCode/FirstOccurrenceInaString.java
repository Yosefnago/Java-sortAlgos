package leetCode;

public class FirstOccurrenceInaString {

	public static void main(String[] args) {
		String a = "leetcode";
		String b = "aleet";
		
		System.out.println(strStr(a,b));

	}
	public static int strStr(String haystack, String needle) {
        

        int i = 0;//Index for haystack;
        int n = needle.length();//
        int j = 0;//index for needle
        
        if(haystack.length() < needle.length()){
            return -1;
        }
        
        while(i < n){
            if(haystack.charAt(i) != needle.charAt(j)) {
            	j++;
            }else if(haystack.substring(i,n).equals(needle)){
                return i;
            }else {
                i++;
            }
        }
        return -1;
 
    }

}
