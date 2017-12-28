package StackQueueAssi;

import java.util.Stack;

public class Minbracket {

     public static int countBracketReversals(String input)
     {
		int c=0;
		Stack<Character> q=new Stack<>();
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch=='{')
			{
			   q.push(ch);
			}else{
				q.pop();
			}
			
			
		}
		while(!q.isEmpty())
		{
			c++;
			q.pop();
			
		}
	
		if(c%2!=0)
		{
			return -1;
		}
       return c/2;

	 }
	
	
	public static void main(String[] args) 
	{

		
		System.out.println(countBracketReversals("{{{{}"));
	}

}
