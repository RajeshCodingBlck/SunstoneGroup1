package SearchingAlgo;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int [] arr, int target) {
		
		int low=0;
		int high=arr.length-1;
		int potentialAns=-1;
		while(low<=high) {
			
			int mid= (low+high)/2;
			if(arr[mid]==target) {
				//return mid;  return Any Index.
				
//				potentialAns=mid;
//				high=mid-1;
				// return MinIndex of Target Value
				
				potentialAns=mid;
				low=mid+1;
				// return MaxIndex of Target Value;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return potentialAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {1,2,2,2,2,2,4,4,5};
         int target=2;
//         int ans= MaxIndex-minIndex+1;
         System.out.println(binarySearch(arr, target));
         
	}

}
