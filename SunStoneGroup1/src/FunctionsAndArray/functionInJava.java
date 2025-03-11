package FunctionsAndArray;

import java.util.Scanner;

public class functionInJava {
      
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=12;
//		int b=13;
//        int ans=add(a,b);// Actual Argument.
//        System.out.println(ans);
		
		Scanner s=new Scanner(System.in);
		int arr[]= new int [5]; 
		// Through this line array not ceated.
//		System.out.println(arr);
//		System.out.println(arr[3]);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	                      // formal Argument.
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
