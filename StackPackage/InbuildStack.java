package StackPackage;

import java.util.*;

public class InbuildStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Stack<Integer> st= new Stack();
//        st.push(20);
//        st.push(30);
//        st.push(50);
//        System.out.println(st);
//        
//        st.pop();
//        System.out.println(st);
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.pop());
//        System.out.println(st);
        
        
        ArrayList<Integer> arr= new ArrayList();
        
        // add
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        System.out.println(arr);
        
//        arr.remove(2);
        System.out.println(arr.get(3));
        
        // update
        arr.set(1, 100);
        System.out.println(arr.size());
	}

}
