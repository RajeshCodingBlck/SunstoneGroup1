package MyQueue;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyQueue q= new MyQueue();
       
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.enqueue(50);
       q.enqueue(100);
       q.display();
       q.dequeue();
       q.dequeue();
       q.dequeue();
       System.out.println(q.front());
       q.display();
       
	}

}
