package Queuell;

public class Main {

	public static void main(String[] args) throws QueueEmptyException
	{
		
		
		Queue<Integer> queue=new Queue<>();
	
		
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);
		queue.enqueue(600);
		queue.enqueue(700);
		queue.enqueue(800);
		
		
		System.out.println(queue.size());
		
//		System.out.println(queue.front());
//		System.out.println(queue.size());
//		
//		queue.dequeue();
//		System.out.println(queue.front());
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		queue.dequeue();
//		System.out.println(queue.front());


		

	}

}
