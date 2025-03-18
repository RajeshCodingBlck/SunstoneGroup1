package TwoDArraydemo;

import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner s= new Scanner(System.in);
       int [][]arr= new int[3][3];
       System.out.println(arr);
       // Update the cells.
       arr[1][2]=10;
       // Access your Cells.
       System.out.println(arr[1][2]);
       
       // Input of 2D Array
       
       // run for Row
       for(int i=0; i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 arr[i][j]=s.nextInt();
    	 }
       }
       
       
	}

}
