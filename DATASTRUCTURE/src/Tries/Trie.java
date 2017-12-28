package Tries;

public class Trie 
{

	private TrieNode root;
	Trie()
	{
		root=new TrieNode('\0');
	}
	
	
	
	public void insert(String word)
	{
		insertword(root,word);
		
	}
	public void insertword(TrieNode root,String word)
	{
		if(word.length()==0)
		{
			root.isterminating = true;
			return ;
		}
		int childindex = word.charAt(0) - 'a';
		TrieNode child = root.children[childindex];
		if(child==null)
		{
			child=new TrieNode(word.charAt(0));
			root.children[childindex] =child;
			
			
			
		}
			insertword(child,word.substring(1));
		
	}

	public  boolean search(String word)
	{
		
		return searchhelper(root,word);
	}
	public boolean searchhelper(TrieNode root,String word)
	{
		if(word.length() == 0 && root.isterminating)
		{
			return true;
		}
		if(word.length() == 0 )
		{
			return false;
		}
		
		int childindex=word.charAt(0) -'a';
		TrieNode child=root.children[childindex];
		if(child == null)
		{
			return false;
		}
		
		return searchhelper(child,word.substring(1));
		
		
		
	}

	public void delete(String word)
	{
		deletehelper(root,word);
	}

	public void deletehelper(TrieNode root,String word)
	{
		if(word.length() == 0)
		{
		    root.isterminating=false;
			return ;
		}
	
		int childindex=word.charAt(0) -'a';
		TrieNode child=root.children[childindex];
		if(child == null)
		{
			return ;
		}
		
		deletehelper(child,word.substring(1));
		
		
	}
}
