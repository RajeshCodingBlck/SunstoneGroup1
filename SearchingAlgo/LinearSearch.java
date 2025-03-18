package SearchingAlgo;

public class LinearSearch {

	public static int linearSearch(int [] arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}else {
				continue;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {10,2,-1,13,3};
      int target=3;
      System.out.println(linearSearch(arr,target));
	}

}
