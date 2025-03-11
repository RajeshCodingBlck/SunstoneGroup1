package Array_question;

import java.util.Scanner;

public class Matrix_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int m= s.nextInt();
      
      int [][] arr= new int[n][m];
      
      for(int row=0 ;row< arr.length; row++) {
    	  
    	  for(int col=0; col< arr[row].length; col++) {
    		  
    		  arr[row][col]= s.nextInt();
    	  }
      }
      
//      rowformiteratio(arr);
      
    for(int row=0 ;row< arr.length; row++) {
    	  
    	  for(int col=0; col< arr[row].length; col++) {
    		  
    		  System.out.print(arr[row][col]+" ");
    	  }
    	  System.out.println();
    	  
      }
      
      
	}

}
