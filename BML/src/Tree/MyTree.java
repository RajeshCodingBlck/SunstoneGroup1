package Tree;

import java.util.Scanner;


public class MyTree {

	  Node root;
	  Scanner s= new Scanner(System.in);
	  
	  MyTree(){
		  
		 root= BuildTree(); 
	  }
	  
	  private Node BuildTree() {
		  
		 
		  System.out.println("Enter the Data");
		  int data= s.nextInt();
		  
		  if(data==-1) {
			  return null;
		  }
		  
		  Node new_node= new Node(data);
		  
		  System.out.println("Enter the left child  of "+ data);
		  new_node.left=BuildTree();
		  
		  System.out.println("Enter the Right child  of "+ data);
		  new_node.right=BuildTree();
		  
		  return new_node;
		  
	  }

}
