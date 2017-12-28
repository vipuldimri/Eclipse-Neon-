package StackQueueAssi;

import java.util.Stack;

public class Redundentbracket {
	
	public static boolean checkRedundantBrackets(String input)
	{

		
		Stack<Character> s=new Stack<>();
		for(int i=0;i<input.length();i++)
		{
			
			char c=input.charAt(i);
			if(c==')')
			{
				   int a=0;
			
					while(s.peek()!='(')
					{
						s.pop();
					    a=a+1;
					    System.out.println(a);
					    System.out.println("end");
					}
					System.out.println("A"+a);
			        if(a==0)
			        {
				       s.pop();
				       return false;
			        }
			}
			else
			{
			s.push(c);
			}
			
		}
		return true;
	}
	
	public static void main(String... S)
	{
		
		System.out.println(checkRedundantBrackets("((a+b))"));
		
	}
}
