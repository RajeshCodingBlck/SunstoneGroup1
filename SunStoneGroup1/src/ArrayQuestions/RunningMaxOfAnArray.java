package ArrayQuestions;

public class RunningMaxOfAnArray {

	public static void getPrefixProduct(int [] arr) {
		
		int n=arr.length;
		int [] ans= new int[n];
		ans[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			ans[i]= ans[i-1]*arr[i];
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
	}
	
	public static void suffixProduct(int [] arr) {
		
		int n=arr.length;
		int [] ans= new int[n];
		ans[n-1]=arr[n-1];
		for(int i=arr.length-2;i>=0;i--) {
			ans[i]= ans[i+1]*arr[i];
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr= {1,12,3,5,10,13,15,2,3,4};
//		getPrefixProduct(arr);
		suffixProduct(arr);
//		int [] ans= new int [arr.length];
//		ans[0]=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			ans[i]= Math.max(arr[i], ans[i-1]);
//		}
//		for(int i=0;i<ans.length;i++) {
//			System.out.print(ans[i]+" ");
//		}
		
	}

}
