package MyQueue;

import java.util.ArrayList;

public class MyQueue {

	  ArrayList<Integer>arr;
	  
	  MyQueue(){
		  arr= new ArrayList();
	  }
	  
	  public boolean isEmpty() {
		  
		  return arr.size()==0;
	  }
	  
	  public void enqueue(int val) {
		  
		  arr.add(val);
	  }
	  
	  public void dequeue() {
		  
		  if(isEmpty()) {
			  return;
		  }
		  arr.remove(0);
		  
	  }
	  
	  public int front() {
		  
		  if(isEmpty()) {
			  return -1;
		  }
		  return arr.get(0);
	  }
	  
	  public void display() {
		  
		  System.out.println(arr);
	  }
	  
}
