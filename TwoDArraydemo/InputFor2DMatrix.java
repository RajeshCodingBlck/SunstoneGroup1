package TwoDArraydemo;

import java.util.*;

public class InputFor2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int rows= s.nextInt();
       int cols= s.nextInt();
       int [][] arr= new int[rows][cols];
      
       
//       In Java 
       int noOfRows= arr.length;
       int noOfCols= arr[0].length;
//       System.out.println(noOfRows+ " "+ noOfCols);
       // Taking Input
       // loop for row
       for(int i=0;i<rows;i++) {
    	  // loop for cols 
    	  for(int j=0;j<cols;j++) {
    		  arr[i][j]= s.nextInt();
    	  }
       }
       
       // print the Matrix..
//       for(int i=0;i<rows;i++) {
//     	  // loop for cols 
//     	  for(int j=0;j<cols;j++) {
//     		 System.out.print(arr[i][j]+" ");
//     	  }
//     	  System.out.println();
//        }
       
    // Row -wise ZigZag Order
       for(int i=0;i<rows;i++) {
	   	 if(i%2==0){// i is Even Row Number
   			for(int j=0;j<cols;j++) {
   		 		 System.out.print(arr[i][j]+" ");
   		 	}
	   	 }else {// i is Odd Row Number
	   		for(int j=cols-1;j>=0;j--) {
  		 		 System.out.print(arr[i][j]+" ");
  		 	}
	   	 }
   	   }
       
       System.out.println("\n...................");
       for(int j=0;j<arr[0].length;j++) {
    	   if(j%2==0) { // cols is Even
    		   for(int i=0; i<arr.length;i++) {
    			   System.out.print(arr[i][j]+" ");
    		   }
    	   }else { // cols is odd
    		   for(int i=arr.length-1; i>=0;i--) {
    			   System.out.print(arr[i][j]+" ");
    		   } 
    	   }
       }
	}
	
	
	

}
