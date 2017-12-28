package Queue;

public class Main {

	public static void main(String[] args) throws QueueEmptyException ,Queuefullexception
	{

		Queueusingarray queue =new Queueusingarray(10);


		for(int i=1;i<=5;i++)
		{
			queue.enqueue(i);
		}
		
		
		while(!queue.isempty())
		{
		System.out.println(queue.dequeue());	
		
		}
		
		
		System.out.println("size is "+queue.size);
		System.out.println(queue.isempty());
	}

}
