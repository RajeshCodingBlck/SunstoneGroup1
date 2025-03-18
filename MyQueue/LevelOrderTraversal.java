package MyQueue;

import java.util.LinkedList;

class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	
}
public class LevelOrderTraversal {

	
	public static void BFS(TreeNode root) {
		
		
		LinkedList<TreeNode> q= new LinkedList();
		
		q.addLast(root);
		while(q.size()>0) {
			
			// remove the front Node
			TreeNode rm= q.removeFirst();
			// work for front Node
			
			System.out.println(rm.val);
			// add their children on Queue
			if(rm.left !=null) {
				q.addLast(rm.left);
			}
			if(rm.right !=null) {
				q.addLast(rm.right);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
