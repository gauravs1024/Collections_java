import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args) {
	HashMap hm= new HashMap();
	//HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	hm.put(101,"gaurav");
	hm.put(102,"Mayank");
	hm.put(103,"Chetan");
	hm.put(104,"Harsh");
	hm.put(105,"Gopesh");
	
	System.out.println(hm);
	System.out.println(hm.get(105));
	
	hm.remove(104);	// remove from the hashmap
	System.out.println(hm);
	System.out.println(hm.containsKey(102));
	System.out.println(hm.containsValue("Harsh"));
	System.out.println(hm.isEmpty());
	
	// return all the keys in set 
	System.out.println(hm.keySet());
	
	// return all the values as Collection
	System.out.println(hm.values());
	
	
	// all the entries return as set
	System.out.println(hm.entrySet());
	
	
	// reading all keys individually
	for(Object i:hm.keySet()) {
		System.out.println(i);
	}
	
	// reading all values individually
		for(Object i:hm.values()) {
			System.out.println(i);
		}
		
	// reading all entry set individually
		for(Object i:hm.keySet()) {
			System.out.println(i+"   "+hm.get(i));
		}
		
		
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(101,"gaurav");
		h.put(102,"Mayank");
		h.put(103,"Chetan");
		h.put(104,"Harsh");
		h.put(105,"Gopesh");
		
		// Entry methods
		
		for(Map.Entry entry:h.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		// iterator
		Set s=h.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	
	

	

	
	
}
}
