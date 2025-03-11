import java.util.*;

public class CSE4HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//             key, value
		HashMap< String, Integer> hm=new HashMap();
		
		// add the Entry
		hm.put("Aman", 60);
		hm.put("Rohan", 40);
		hm.put("Sahil", 65);
//		System.out.println(hm);
		
		hm.put("Sahil", -10);
//		System.out.println(hm);
		
		 System.out.println(hm.get("Rohit"));
		 System.out.println("Rohit "+ hm.getOrDefault("Rohit", -1));
		 
		 // remove
//		 hm.remove("Rohan");
		 System.out.println(hm.getOrDefault("Rohan", -20));
		
		 System.out.println("..........................\n");
		 int [] arr= {1,2,3,4,5,6,7,8};
		 for( int element : arr ) {
			 System.out.print(element+" ");
		 }
		 
		 System.out.println("..........................\n");
		 
		 for( String key: hm.keySet()) {
			 System.out.println(key + " -> "+ hm.get(key));
		 }
		 System.out.println("..........................\n");
		 for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			 System.out.println(entry.getKey()+" "+ entry.getValue());
		 }
		 
		 
	}

}
