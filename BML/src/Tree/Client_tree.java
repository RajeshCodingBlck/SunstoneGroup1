package Tree;

public class Client_tree {
   
	public static void Preorder(Node root) {
		
		  if(root==null) {
			  return ;
		  }
		
		 System.out.print(root.data+" ");
		 Preorder(root.left);
		 Preorder(root.right);
		 
	}
	
	public static void PostOrder(Node root) {
		
		  if(root==null) {
			  return ;
		  }
		
		
		 Preorder(root.left);
		 Preorder(root.right);
		 
		 System.out.print(root.data+" ");
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyTree t= new MyTree();
       
       Preorder(t.root);
       
	}

}
