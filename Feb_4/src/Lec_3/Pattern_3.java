package Lec_3;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       
       int row=1;
       
       int nst=n;
       while(row<=n) {
    	   
    	   // Print the Star
    	   
    	   int i=1;
    	   while(i<=nst) {
    		   System.out.print("*");
    		   i=i+1;
    	   }
    	   
    	   // Preparation for Next Row
    	   nst=nst-1;
    	   
    	   System.out.println();
   
    	   row=row+1;
       }
	}

}
