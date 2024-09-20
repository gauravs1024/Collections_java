import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable_example {
	public static void main(String[] args) {
		//Hashtable t =new Hashtable();	// default capacity is 11 and load factor is 0.75
		
//		Hashtable t= new Hashtable(initial capacity);// create hashtable object with some capacity
//		Hashtable t=new Hashtable(Intialcapacity,fillratio/loadfactor);
		
		Hashtable<Integer,String > t= new Hashtable<Integer,String>();
		t.put(101, "Rahul");
		t.put(102, "Amit");
		t.put(103, "KIshore");
		t.put(104, "shreya");
// 		t.put(null, "Rahul");	// null pointer exception
//		t.put(104,null);		//Null pointer exceptiom but hashmap allows only one null  key and multiple null values
		System.out.println(t);
		
		//get()
		System.out.println(t.get(103));
		
		// remove()
		t.remove(102);
		System.out.println(t);
		
		//containsKey()
		System.out.println(t.containsKey(103));
		
		
		//containsValue()
		System.out.println(t.containsValue("shreya"));
		System.out.println(t.contains("shreya"));
		
		//isEmpty()
		System.out.println(t.isEmpty());
		
		//keySet()
		System.out.println(t.keySet());
		
		//Values()
		System.out.println(t.values());
		
		// for loop
		
		for(int k:t.keySet()) {
			System.out.println(k+"  "+t.get(k));
		}
		
		//Entry Specific method
		
		for(Map.Entry a:t.entrySet()) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
		//iterator
		Set s=t.entrySet();
		Iterator itr=s.iterator();		
		while(itr.hasNext()) {
			Map.Entry entry=(Entry)itr.next();
;			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		

		
		
		
		
		
	}
}
