package Array_question;

public class Rotate_the_array {
   
	public static void reverseInRange(int [] arr, int s, int e) {
		
		int i=s;
		int j=e;
		
		while(i<j) {
			
			// Swapping
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr= {1,2,3,4,5,6,7};
		
		int k=-10;
	
		k=k%arr.length;
		if(k<0) {
			k+=arr.length;
		}
//		System.out.println(-3%5);
		reverseInRange(arr,0, arr.length-1);
		reverseInRange(arr,0,k-1);
		reverseInRange(arr, k, arr.length-1);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
