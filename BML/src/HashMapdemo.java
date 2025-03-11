import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {

	public static void main(String[] args) {
		
      HashMap<String, Integer> hm= new HashMap();
      hm.put("Aman",70 );
      hm.put("Rahul", 60);
      hm.put("Ajay", 45);
      hm.put("Ajay", 61);
      
      System.out.println(hm.get("Aman"));
      System.out.println(hm.getOrDefault("Aman", -1));
      
//      hm.remove("Aman");
       System.out.println(hm.containsKey("Ajit"));
      
      // iterate 
      System.out.println(".............");
      int [] arr= {1,2,3,4,5,6};
      for(int element : arr) {
    	  System.out.print(element+" ");
      }
      System.out.println("\n.............");
      for (String key:hm.keySet()) {
    	  System.out.println(key+" "+hm.get(key));
      }
      System.out.println("\n.............");
      for(Map.Entry<String, Integer> entry: hm.entrySet()) {
    	  System.out.println(entry.getKey()+ " "+ entry.getValue());
      }
      
      
      
      
	}

}
