package Graphs;
import java.util.*;
public class LargestPiece 
{

	public int solve(int n,String cake[]) 
    {
     int arr[][]= new int[n][cake[0].length()];
     for(int i=0;i<n;i++)
     {
    	 for(int j=0;j<cake[i].length();j++)
    	 {
    		 
    		 arr[i][j] = Character.getNumericValue(cake[i].charAt(j)); 
 
    	 }
     }
     
     
     boolean visited[][]= new boolean[n][cake[0].length()];
     int max=0;
    
     for(int i=0;i<n;i++)
     {
    	 for(int j=0;j<cake[i].length();j++)
    	 {
    		 
    		 	if(arr[i][j] == 1 && !visited[i][j])
    		 	{
    		 	
    		 		int no = helperDFS(i,j,arr,visited);
    		 		if(no > max)
    		 		{
    		 			max = no;
    		 		}
    		 	}
    		 
    	 }
     }
     
     
     
     
     
     return max;
    }
	public int helperDFS(int i,int j,int arr[][],boolean visited[][])
	{
		
		
		boolean visit[][] =new  boolean[arr.length][arr[i].length];
		
		int ans = help(i,j,arr,visited,visit);
		return ans;
	}
	
	public int help(int i,int j,int arr[][],boolean visited[][],boolean visit[][])
	{
		int count=0;
		visited[i][j]=true;
		visit[i][j]=true;
		if(j - 1 >= 0) //left
		{
			
			if(arr[i][j-1] == 1 && !visit[i][j-1])
			{
				
				count += help(i,j-1,arr,visited,visit);

			}
		}
		
		if(j + 1 < arr[i].length) //right
		{
			if(arr[i][j+1] == 1 && !visit[i][j+1])
			{
				count +=	help(i,j+1,arr,visited,visit);
			}
			
		}
		if(i-1 >= 0 )//up
		{
			if(arr[i-1][j] == 1 && !visit[i-1][j])
			{
				count +=	help(i-1,j,arr,visited,visit);

			}
		}
		if(i+1 < arr.length)//down
		{
			if(arr[i+1][j] == 1 && !visit[i+1][j])
			{
				
				count +=	help(i+1,j,arr,visited,visit);
				
			}
			
		}

		return count+1;
	}
	
	
	
	public static void main(String[] args)
	{

			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			String str[] = new String[n];
			for(int i=0;i<n;i++)
			{
				str[i]=sc.next();
			}
			
			LargestPiece obj =new LargestPiece();
			System.out.println(obj.solve(n,str));
			
			
	}

}
