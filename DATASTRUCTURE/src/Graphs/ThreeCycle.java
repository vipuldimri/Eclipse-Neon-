package Graphs;
import java.util.*;
public class ThreeCycle 
{

	  static public int solve(int n,int m,int U[],int V[]) 
	  {

		  int arr[][]=new int[n][n];
		  for(int i=0;i<m;i++)
		  {
				  arr[U[i]-1][V[i]-1]=1;
				  arr[V[i]-1][U[i]-1]=1;
		
		  }
		  
		  for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
			    }
		  
		  return 1;
		  
		  
		  
	  }
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int U[]=new int[m];
		for(int i=0;i<U.length;i++)
		{
			U[i]=sc.nextInt(); 
		}
		int V[]=new int[m];
		for(int i=0;i<V.length;i++)
		{
			U[i]=sc.nextInt();	
		}
		
		//System.out.println("abhe solve krna h ye ");
		solve(n,m,U,V);
		
	}

}
