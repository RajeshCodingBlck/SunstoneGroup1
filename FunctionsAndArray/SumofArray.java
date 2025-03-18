package FunctionsAndArray;

public class SumofArray {

	public static int getSum(int [] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int getMax(int []arr) {
		
		int maxValue=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]> maxValue) {
				maxValue=arr[i];
			}
		}
		return maxValue;
	}
	public static int getMin(int [] arr) {
		
		int minValue=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]< minValue) {
				minValue=arr[i];
			}
		}
		return minValue;
	}
	
	public static void reverse(int [] arr) {
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {10,2,3,4,5};
      int ans=getMin(arr);
      System.out.println(ans);
      reverse(arr);
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
