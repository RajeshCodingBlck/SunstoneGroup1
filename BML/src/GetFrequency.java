import java.util.*;

public class GetFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,1,1,2,1};
      HashMap<Integer, Integer> hm= new HashMap();
      
      for(int i=0;i<arr.length;i++) {
    	  if(hm.containsKey(arr[i])) {
    		  int oldFre= hm.get(arr[i]);
    		  hm.put(arr[i], oldFre+1);
    	  }else {
    		  hm.put(arr[i], 1);
    	  }
    	  
//    	  int fre= hm.getOrDefault(arr[i], 0);
//    	  hm.put(arr[i], fre+1);
      }
      
      for( Integer key :hm.keySet()) {
    	  
    	  if(hm.get(key)> arr.length/2) {
    		  System.out.println(key +" "+ hm.get(key));
    	  }
      }
      
      
	}

}
