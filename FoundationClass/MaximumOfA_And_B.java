package FoundationClass;

import java.util.Scanner;

public class MaximumOfA_And_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b= s.nextInt();
		if(a>b) {
			System.out.println("a is Maximum");
		}else {
			System.out.println("b is Maximum");
		}
	}

}
