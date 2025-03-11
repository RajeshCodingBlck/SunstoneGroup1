import java.util.HashMap;

public class MajorityElementCSE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,2,1,1,3,1};
       HashMap<Integer, Integer> hm= new HashMap();
       
       for(int element : arr) {
    	   int fre= hm.getOrDefault(element, 0);
    	   hm.put(element, fre+1);
       }
       
       boolean flag=false;
       for( Integer key: hm.keySet()) {
    	   System.out.println(key +" "+ hm.get(key));
    	   if(hm.get(key) > (arr.length/2)) {
//    		   System.out.println(key);
    		   flag=true;
//    		   break;
    	   }
       }
       if(flag==false) {
    	   System.out.println("No Majority Element");
       }
	}

}
