package StringDemo;

import java.util.*;

public class reverseTheString {

	public static String reverse(String str) {
		
		String reverse="";
		for(int i= str.length()-1; i>=0;i--) {
			reverse= reverse+ str.charAt(i);
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       String str= s.next();
       String reverseString= reverse(str);
       if(reverseString.equals(str)) {
    	   System.out.println("Palidromic");
       }else {
    	   System.out.println("Not Palidromic");
       }
       
	}

}
