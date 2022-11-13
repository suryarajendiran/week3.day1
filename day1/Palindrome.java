package week3.assignment.day1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="madam";
		char[] newArray = input.toCharArray();
		String rev="";  
		for(int i=newArray.length-1;i>=0;i--){  
	        rev+=newArray[i];  
	    }
	    char[] a = input.toCharArray();
		char[] b = rev.toCharArray();

		if(Arrays.equals(a, b)) {
			System.out.println("madam is palindrome");
		}else {
			System.out.println("madam is not palindrome");
		}
	}

}
