package Graphs;
import java.util.*;
public class CodingNinja 
{

	static boolean ans=false;
	public static boolean solve(char[][] arr , int N, int M)
	{
		char code[]={'c','o','d','i','n','g','n','i','n','j','a'};
		for(int i=0;i<N;i++)
		{
			for(int j=0;j< M;j++)
			{
				if(ans==true)
				{
					break;
				}
				if(arr[i][j]=='c')
				{
					boolean visited[][]=new boolean[N][M];
					int index=1;
					//System.out.println("hello");
					checkpath(arr,N,M,i,j,visited,code,index);
				}
				//sout
			}
			if(ans==true)
			{
				break;
			}
			
			
		}
     return ans;
	}
	public static void checkpath
	(char[][] arr,int N,int M,int x,
	int y,boolean visited[][],char code[],int index)
	{
		//System.out.println("heldsgsdglo");

		System.out.println(x+" "+y+" value "+arr[x][y]);		
		if(index == 11)
		{
		ans=true;	
		return ;
		}
		
		visited[x][y]=true;
		if(x-1 >= 0)
		{
			if(arr[x-1][y]==code[index])
			{
				if(visited[x-1][y]==false)
				{
					//System.out.println("here");
				checkpath(arr,N,M,x-1,y,visited,code,index+1);
				}
			}
		}
		if(y -1 >= 0)
		{
			if(arr[x][y-1]==code[index])
			{
				if(visited[x][y-1]==false)
				{
					//System.out.println("asf");
				checkpath(arr,N,M,x,y-1,visited,code,index+1);
				}
			}
		}
		if(x +1 < N)
		{
			if(arr[x+1][y]==code[index])
			{
				if(visited[x+1][y]==false)
				{
					//System.out.println("vipuylll");
				checkpath(arr,N,M,x+1,y,visited,code,index+1);
				}
			}
		}
		if(y + 1 < M )
		{
			if(arr[x][y+1]==code[index])
			{
				if(visited[x][y+1]==false)
				{
					//System.out.println("asd");
				checkpath(arr,N,M,x,y+1,visited,code,index+1);
				}
			}
		}
		if(x-1 >= 0 && y -1 >=0)
		{
			if(arr[x-1][y-1]==code[index])
			{
				if(visited[x-1][y-1]==false)
				{
					//System.out.println("12");
				checkpath(arr,N,M,x-1,y-1,visited,code,index+1);
				}
			}
		}
		if(x +1 <N && y- 1 >= 0)
		{
			if(arr[x+1][y-1]==code[index])
			{
				if(visited[x+1][y-1]==false)
				{
					//System.out.println("34");
				checkpath(arr,N,M,x+1,y-1,visited,code,index+1);
				}
			}
		}
		if(x-1 >= 0 && y +1 < M)
		{
			if(arr[x-1][y+1]==code[index])
			{
				if(visited[x-1][y+1]==false)
				{
					//System.out.println("000");
				checkpath(arr,N,M,x-1,y+1,visited,code,index+1);
				}
			}
		}
		if(x + 1 < N && y + 1 < M)
		{
			//System.out.println("vipul "+x+" "+y);
			//System.out.println(arr[x+1][y+1]);
			//System.out.println(code[index]);
			if(arr[x+1][y+1]==code[index])
			{
				//System.out.println("jhjh");

				if(visited[x+1][y+1]==false)
				{
				checkpath(arr,N,M,x+1,y+1,visited,code,index+1);
				}
			}
		}
		
	
	}
	int solve(String[] Graph , int N, int M)
	{
		
		char arr[][]=new char[N][M];
		for(int i=0;i<N;i++)
		{
			String str=Graph[i];
			for(int j=0;j<M;j++)
			{
				
				arr[i][j]=str.charAt(j);
			}
			
	    }
		solve(arr,N,M);

		if(ans==true)
		{
			return 1;
		}
		return  0;
	}	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();  //row
		int M=sc.nextInt();  //coloum
	
		char arr[][]=new char[N][M];
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				
				arr[i][j]=sc.next().charAt(0);
			}
			
	    }
		
//		for(int i=0;i<N;i++)
//		{
//			for(int j=0;j<M;j++)
//			{
//				
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//	    }
		
		
        solve(arr,N,M);
    	System.out.println(ans);
		
	}
}
