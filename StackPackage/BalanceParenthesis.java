package StackPackage;

import java.util.*;

public class BalanceParenthesis {

	public static boolean isBalanced(String str) {
		
		Stack<Character> st= new Stack();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='(') {
				st.push('(');
			}else {
				if(st.size()==0) {
					return false;
				}else {
					st.pop();
				}
			}
		}
		
		return st.size()==0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="()()()((((";
       System.out.println(isBalanced(str));
	} 

}
