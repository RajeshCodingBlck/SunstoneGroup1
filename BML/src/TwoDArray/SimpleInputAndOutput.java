package TwoDArray;

import java.util.Scanner;

public class SimpleInputAndOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [][] arr= new int[3][4];
		Scanner s= new Scanner(System.in);
		for(int i=0; i<3;i++) {
			for(int j=0; j<4;j++) {
				arr[i][j]= s.nextInt();
			}
		}
		for(int i=0; i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			
			if(i%2==0) {
				for(int j=0;j<4;j++) {
					System.out.print(arr[i][j]+" ");
				}
//				System.out.println();
			}else {
				for(int j=3;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
//				System.out.println();
			}
		}
		
	}

}
