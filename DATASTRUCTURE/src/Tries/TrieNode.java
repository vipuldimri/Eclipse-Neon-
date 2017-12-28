package Tries;

public class TrieNode 
{
	char data;
	boolean isterminating;
	TrieNode children[];
	
	
	TrieNode(char data)
	{
		this.data=data;
		isterminating =false;
		children=new TrieNode[26];
	}

}
