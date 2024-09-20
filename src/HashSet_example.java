import java.util.HashSet;
import java.util.Iterator;

public class HashSet_example {
	public static void main(String[] args) {
//		HashSet hs=new HashSet(100);    //intitial capacity 100
//		HashSet hs=new HashSet(10,(float)0.90);     //capacity,loadfactor
//		HashSet <Integer> hm=new HashSet<Integer>();
		
		HashSet hs=new HashSet();  // default capacity 16 and load factor 0.75
		
		//Add objects/elements into HashSet
		hs.add(100);
		hs.add(300);
		hs.add("hello");
		hs.add(null);
		hs.add('A');
		hs.add(true);
		
		System.out.println(hs);			//[null, A, 100, hello, 300, true]

		//remove()
		hs.remove(100);
		System.out.println("after removing the element"+hs);			//after removing the element[null, A, hello, 300, true]

		//contains
		
		System.out.println(hs.contains("hello"));
		
		//isEmpty
		System.out.println(hs.isEmpty());
		
		
		//reading elements from hashset using for...each loop
		for(Object e:hs) {
			System.out.println(e);
		}
		
		
		// iterator method
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//
		HashSet <Integer> evenNumber=new HashSet<Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);	
		evenNumber.add(8);

		System.out.println("eVEN NUMBER HASH SET"+evenNumber);
		
		//addAll   or    Union

		hs.addAll(evenNumber);
		hs.add(2000);
		System.out.println("aftyer adding all elements in  HAsh Set "+hs);
		
		//removeALl or difference
		hs.removeAll(evenNumber);
		System.out.println("difference...."+hs);
		//retainAll   or   intersection
		hs.retainAll(evenNumber);		
		System.out.println("Intersection...."+hs);
		
		//containsAll or subset
		System.out.println("is evennumber is the subset of hs set or not "+hs.containsAll(evenNumber));
		System.out.println("subset...."+hs);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
