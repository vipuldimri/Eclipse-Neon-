package Graphs;
import java.util.*;
public class Connectingdoats 
{

	int solve(String[] board , int n, int m)
	{

		char arr[][] =new char[n][m];
		 for(int i=0;i<n;i++)
		     {
		    	 for(int j=0;j<m;j++)
		    	 {
		    		 
		    arr[i][j] = board[i].charAt(j); 
		 
		    	 }
		     }
		 
		 for(int i=0;i<n;i++)
	     {
	    	 for(int j=0;j<m;j++)
	    	 {
	    		 boolean visited[][] = new boolean[n][m];
	    		 int ans =helperDFS(i,j,arr,n,m,visited);
	    		 System.out.println("ans "+ans);
	    		 if(ans >= 4)
	    		 {
	    			 return 1;
	    		 }
	    	 }
	     }
		
		 
		 
		return 0;
	}	
	
	public int helperDFS(int i,int j,char arr[][],int n,int m,boolean visited[][])
	{
		int countt=0;
		visited[i][j] = true;
		if(j - 1 >= 0) //left
		{
			
			if(arr[i][j-1] == arr[i][j] && !visited[i][j-1])
			{
				
				 countt+=helperDFS(i,j-1,arr,n,m,visited);
				
			}
		}
		
		if(j + 1 < m) //right
		{
			if(arr[i][j+1] == arr[i][j] && !visited[i][j+1])
			{
				 countt+=helperDFS(i,j+1,arr,n,m,visited);
			
			}
			
		}
		if(i-1 >= 0 )//up
		{
			if(arr[i-1][j] == arr[i][j] && !visited[i-1][j])
			{
				 countt+=helperDFS(i-1,j,arr,n,m,visited);
				
			}
			
		}
		if(i+1 < n)//down
		{
			if(arr[i+1][j] == arr[i][j] && !visited[i+1][j])
			{
				
				 countt+=helperDFS(i+1,j,arr,n,m,visited);
				
			
		    }

		
		
	     }
		return countt+1;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		String str[] = new String[n];
		for(int i=0 ;i < n ;i++)
		{
			
			str[i]=sc.next();
		}
		Connectingdoats obj = new Connectingdoats();
		System.out.println(obj.solve(str, n, m));
		
		
		
		
	}

}
