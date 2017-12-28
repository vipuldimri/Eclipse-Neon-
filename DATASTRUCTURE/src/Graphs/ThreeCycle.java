package Graphs;
import java.util.*;
public class ThreeCycle 
{

	  static public int solve(int n,int m,int U[],int V[]) 
	  {

		  int arr[][]=new int[n][n];
		
		 for(int i=0 ; i<m ; i++)
		  {
			  
			  arr[U[i]-1][V[i]-1] =1;
			  arr[V[i]-1][U[i]-1] =1;
		  }
		  
		 
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 for(int j=0;j<arr.length;j++)
//			 {
//				 System.out.print(arr[i][j]+" ");
//			 }
//			 System.out.println();
//		 }
		  int count = 0;
		  
		 for(int i=0;i < n ; i++)
		 {
		
			 for(int j=0; j<n ; j++)
			 {
				 
				 
				 if(arr[i][j] == 1 )
				 {

					 for(int k=0 ; k < n ; k++)
					 {
						 if(arr[j][k] == 1 &&  k!=i)
						 {
							if(arr[i][k] == 1)
							{
								System.out.println("here "+i+","+k);
								count++;
							}
							 
						 }
					 }
					 
				 }
				 
			 }
			 
			 
			 
			 
		 }
		 
		 System.out.println("count is "+count);
		  return count / 6;
		  
		  /*
		   * 5
14
5 5 1 1 1 2 2 2 3 3 4 4 4 4
4 2 2 3 4 1 4 5 1 4 1 2 3 5
		   */
		  
	  }
	  
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int U[]=new int[m];
		for(int i=0;i<m;i++)
		{
			U[i]=sc.nextInt(); 
		}
		int V[]=new int[m];
		for(int i=0;i<m;i++)
		{
			V[i]=sc.nextInt();	
		}
		
		System.out.println(	solve(n,m,U,V));
		
	}

}
