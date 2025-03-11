package StringDemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		// 1st Method
//		String str1= new String("Helloooooooaa");
//		
//		// 2nd Method
//		String str2= "Hello"; // String literal
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		System.out.println(str1.length());
//		System.out.println(str1.charAt(4)); // cpp str1[i]
//		
//		// Substring -> Continuous part of String in forward Direction(forward order).
//	   System.out.println(str1.substring(1,6));
		
		
		Scanner s= new Scanner(System.in);
		
		String str= s.nextLine().intern(); // heap
		System.out.println(str);
	   
	   
	}
	

}
