package StackPackage;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MyStack st= new MyStack();
		
		st.push(13);
		st.push(20);
		st.push(50);
		System.out.println(st.peek());
		st.pop();
		st.pop();
		st.pop();
		
		System.out.println(st.peek());
		
		System.out.println(st.size());
	}

}
