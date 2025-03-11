package Recursion;

public class SumOfNaturalNumber {

	// Define Take N and return sum of first N natural number.
	public static int  getSum(int n) {  
		
		if(n==1) {
			return 1;
		}
		
		int SmallerAns= getSum(n-1); 
		int BiggerAns= SmallerAns + n;
		return BiggerAns;
		
	}
	
	// Take N then print first N natural Number .
	public static void printInc(int n) {
		
//		if(n==0) {  // -ve Base
//			return ;
//		}
		
		if(n==1) { // +ve Base 
			System.out.println(1);
			return;
		}
		printInc(n-1);
		System.out.println(n);
	}
	
	public static void printDec(int n) {
		
		
		if(n==1) { // +ve Base 
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printDec(n-1);
		
	}
	
	public static void printArray(int [] arr, int i) {
	    
		 if(i==arr.length) {
			 return ;
		 }
		
		 System.out.print(arr[i]+" ");
		 printArray(arr, i+1);
		 
	}
	
	public static int sumArray(int [] arr, int i) {
	
		if(i==arr.length) {
			 return 0;
		 }
		  
		  int SmallerAns=sumArray(arr, i+1);
		  int BiggerAns= arr[i]+ SmallerAns;
		  return BiggerAns;
	}
	
	public static String replace_aToA(String str, int i) {
		
		if(i== str.length()) {
			return "";
		}
		String smallerAns=replace_aToA(str, i+1);
		String biggerAns= "";
		if(str.charAt(i)=='a') {
			biggerAns= "A"+ smallerAns;
		}else {
			biggerAns= str.charAt(i)+smallerAns;
		}
		return biggerAns;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         System.out.println(getSum(5));
//         printDec(7);
		  int [] arr= {10,2,1,3,4,5};
//		  printArray(arr,0);
//		  System.out.println(sumArray(arr, 0));
		  String str= "abaAaaaaABbbbaaa";
		  System.out.println(replace_aToA(str, 0));
	}
	

}
