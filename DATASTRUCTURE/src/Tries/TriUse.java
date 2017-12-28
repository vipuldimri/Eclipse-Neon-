package Tries;

public class TriUse {

	public static void main(String[] args) 
	 {
		
		System.out.println("running");
		Trie t=new Trie();
		t.insert("vipul");
		t.insert("dimri");
		t.insert("vaibhav");
		
		System.out.println(t.search("dimri"));
		
		t.delete("dimri");

		System.out.println(t.search("dimri"));
	}

}
