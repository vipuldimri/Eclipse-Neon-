package StackQueueAssi;

import java.util.Stack;

public class Reversestack {

	
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) 
    {
      
    
			if(s1.size()==1)
			{
				return ;
			}
      
			int x=s1.pop();
			reverseStack(s1,s2);
			
			while(!s1.isEmpty())
			{
				
				int y=s1.pop();
				s2.push(y);
			}
			s1.push(x);
			while(!s2.isEmpty())
			{
				
				int y=s2.pop();
				s1.push(y);
			}
			
			
      
      
      
      }
	public static void main(String[] args) 
	{
		
		
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();

		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		
		

		reverseStack(s1,s2);
	}

}
