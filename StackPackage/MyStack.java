package StackPackage;

import java.util.ArrayList;

public class MyStack {
    
	  ArrayList<Integer> arr;
	  
	  MyStack(){
		  arr= new ArrayList();
	  }
	  
	  public boolean isEmpty() {
		  
		  return arr.size()==0;
	  }
	  
	  public void push(int val) {
		  
		  arr.add(val);
	  }
	  
	  public int pop() {
		
		   if(isEmpty()) {
			   System.out.println("Stack is underflow");
			   
			   return -1;
		   }
		  int val= arr.get(arr.size()-1);
		  arr.remove(arr.size()-1);
		  return val;
	  }
	  
	  
	  public int peek() {
		  if(isEmpty()) {
			   System.out.println("Stack is underflow");
			   
			   return -1;
		   }
		  int val= arr.get(arr.size()-1);
		  return val;
	  }
	  
	  public int size() {
		 return arr.size(); 
	  }
}
