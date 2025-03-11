package Tree;

import java.util.HashMap;

public class HashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              //  key,     value
	    HashMap<String, Integer> m= new HashMap();
	    
	    m.put("Ayush", 45);
	    m.put("Mohan", 37);
	    m.put("Sohan", 78);
	    
	    m.put("Ayush", 70);
	    m.put(null,40);
	    System.out.println(m);
//	    
	    System.out.println(m.get("Moha"));
////	    
	    System.out.println(m.containsKey("Ayush"));
////	    
	    m.remove("Mohan");
	    System.out.println(m);
////	    
	    for( String key : m.keySet()) {
	    	
	    	System.out.println(key+ " , "+ m.get(key));
	    }
////	    
	    System.out.println(m.size());
	    
	    
	    
	    
	    
	    
	}

}
