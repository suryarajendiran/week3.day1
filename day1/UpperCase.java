package week3.assignment.day1;

public class UpperCase {
	public static void main(String args[]){  
		String s1="changeme";  
		String s2="";
		char[] S = s1.toCharArray(); 
		for (int i = 0; i < s1.length(); i++) {
			//charArray[i] = Character.toUpperCase(charArray[i]);
			if(i%2 !=0) {
				s2 += Character.toUpperCase(S[i]);
			}
				else {
					s2 += Character.toLowerCase(S[i]);
			}
		}
		System.out.println(s2);
		} 


}

/*
 Pseudo Code
 
 * Declare String Input as Follow
  
 * String test = "changeme";
 
 * a) Convert the String to character array
 
 * b) Traverse through each character (using loop)
 
 * c)find the odd index within the loop (use mod operator)
 
 * d)within the loop, change the character to uppercase, if the index is odd else don't change
  
 */