package FoundationClass;

import java.beans.Statement;
import java.util.Scanner;

public class maximumOfABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
              
//        s.nextLine(); //
        // Method 1 Only using if else Statement..
        if(a>b && a>c) {
        	System.out.println("a is Maximum");
        }else {
        	if(b>c) {
        		System.out.println("b is Maximum");
        	}else {
        		System.out.println("c is Maximum");
        	}
        }
        
        // if else if
        
//        it way of giving choice between multiple 
//         if Statement
        // Method2 
        if(a>b && a>c) {
        	System.out.println("a is Maximum");
        }else if(b>c) {
        	System.out.println("b is Maxmimum");
        }else {
        	System.out.println("C is Maximum");
        }
        
////        int a=12;
//        if(a==13){
//            System.out.println("a is 13");
//        }else if(a==12){
//            System.out.println("a is 12");
//        }else if(a==12){
//            System.out.println("a is 12");
//        }else{
//            System.out.println("a is not 12 and 13");
//        }
        
        
        
        
	}

}
