import java.util.Arrays;

public class SortingAndSearching {

	public static boolean isSorted(int [] arr) {
		
		int n=arr.length;
		for(int i=0; i<=n-1;i++) {
			if(arr[i]<=arr[i+1]) {
				continue;
			}else {
//				System.out.println("Hello");
				return false;
			}
		}
		return true;
	}
	
	public static boolean pairSum(int [] arr, int target) {
		
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			
			int sum=arr[i]+arr[j];
			if(sum<target) {
				i++;
			}else if(sum>target) {
				j--;
			}else {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {3,1,2,1,3,4};
       System.out.println(isSorted(arr));
       System.out.println(pairSum(arr, 7));
       
       
	}

}
