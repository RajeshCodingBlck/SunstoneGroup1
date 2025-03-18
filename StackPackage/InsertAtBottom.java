package StackPackage;

import java.util.*;

public class InsertAtBottom {

	public static void insertAtBottom(Stack<Integer> st, int val) {
		
		Stack<Integer> temp= new Stack();
		
		while(st.size() >0) {
		    int topElement= st.pop();
		    temp.push(topElement);
		}
		st.push(val);
		
		while(temp.size()>0) {
		   int topElement= temp.pop();
		   st.push(topElement);
		}
	}
	
	public static void insertAtBottomMethod2(Stack<Integer> st, int val) {
		
		if(st.size()==0) {
			st.push(val);
			return;
		}
		
		int topElement= st.pop();
		insertAtBottomMethod2(st, val);
		st.push(topElement);
		
	}
	
	public static void reverse(Stack<Integer> st) {
		
		if(st.size()==0) {
			return;
		}
		int topElement= st.pop();
		reverse(st);
		insertAtBottom(st, topElement);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<Integer> st= new Stack();
      st.push(6);
      st.push(10);
      st.push(20);
      System.out.println(st);
//      insertAtBottomMethod2(st,1000);
      reverse(st);
      System.out.println(st);
	}

}
