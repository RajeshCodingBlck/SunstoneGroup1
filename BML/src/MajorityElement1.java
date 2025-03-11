import java.util.*;

public class MajorityElement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,1,2,2,2,3,2};
      HashMap<Integer, Integer> m= new HashMap();
      
      for(int i=0;i<arr.length;i++) {
    	  if(m.containsKey(arr[i])) {
    		  int oldFre= m.get(arr[i]);
    		  m.put(arr[i], oldFre+1);
    	  }else {
    		  m.put(arr[i],1);
    	  }
      }
      
      for( Integer key: m.keySet()) {
    	  if(m.get(key) > (arr.length/2)) {
    		  System.out.println(key);
    	  }
      }
      
	}

}
