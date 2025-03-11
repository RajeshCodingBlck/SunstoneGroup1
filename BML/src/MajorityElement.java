import java.util.*;

public class MajorityElement {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,Integer> fr = new HashMap();
		int arr[]= {1,2,3,1,1,1,1,2,2,3};
		for(int element:arr) {
			if(fr.containsKey(element)) {
		      int val=fr.get(element);
				fr.put(element, ++val);
			}else {
				fr.put(element, 1);
			}
		}
		for(int key:fr.keySet()) {
			if(fr.get(key)>=(arr.length/2)) {
				System.out.println(key);
			}
		}
		
		

	}

}
