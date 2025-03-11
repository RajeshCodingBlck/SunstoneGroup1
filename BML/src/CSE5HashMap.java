import java.util.*;

public class CSE5HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//               key, value
		HashMap<  String,Integer> hm= 
				new HashMap();
		
		//  add the item
		hm.put("Aman", 56);
		hm.put("Mohan", 46);
		hm.put("Sahil", 78);
		System.out.println(hm);
		
		// Update
		hm.put("Sahil", 100);
		System.out.println(hm);
		
		System.out.println(hm.get("Mohit"));
		System.out.println(hm.getOrDefault("Aman", -100));
		
		System.out.println(hm.containsKey("Ankit"));
		
		hm.remove("Aman");
		System.out.println(hm.size());
		
		
//		forEach loop
		
		System.out.println("\n..................");
		int [] arr= {1,2,3,4,5,6,7,8};
		for( int val: arr) {
			System.out.print(val+" ");
		}
		System.out.println("\n..................");
		
		for ( String str: hm.keySet()) {
			System.out.println(str+ " "+ hm.get(str));
		}
		System.out.println("\n..................");
		
		for( Map.Entry<String, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		
		
		
		
	}

}
