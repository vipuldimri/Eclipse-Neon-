package Maps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MAP<K,V>
{
	
	ArrayList<Mapnode<K, V>> bucket; //array can't be generic
	int size;//map ka
	int numbucket;
	
	
	MAP()
	{
		numbucket =20;
		for(int i=1;i<=numbucket;i++)
		{
			bucket.add(null);   
			//to make array list behave like array
		}
		
		
	}
	
	
	private int getbucketindex(K key)
	{
		int hashcode=key.hashCode();
		return hashcode % numbucket;
	}

	public void insert(K key,V value)
	{
		int bucketindex=getbucketindex(key);
		Mapnode<K, V> head=bucket.get(bucketindex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				
				head.value=value;
				return ;
			}
			
			head=head.next;
		}
	   head=bucket.get(bucketindex);
	   Mapnode<K, V> newnode=new Mapnode<>(key, value);
	   newnode.next=head;
	   bucket.set(bucketindex, newnode);
	   

		
		
	}

	
	public int size()
	{
		return size;
	}
	public V getValue(K key)
	{
		int bucketindex=getbucketindex(key);
		Mapnode<K, V> head=bucket.get(bucketindex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			
			head=head.next;
		}
		return null;
		
		
	}

	public V removeKey(K Key)
	{
		int bucketindex=getbucketindex(Key);
		Mapnode<K, V> head=bucket.get(bucketindex);
		Mapnode<K, V> prev=null;
		while(head!=null)
		{
			if(head.key.equals(Key))
			{
				if(prev==null)
				{
					bucket.set(bucketindex, head.next);
				}
				else
				{
				prev.next=head.next;
				return head.value;
				}
			}
			prev=head;
			head=head.next;
		}
		return null;
	}
}
