import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_example {
	
	public static void main(String[] args) {

		//Declare Linked List
		//LinkedList<Integer> l=new LinkedList<integer>();
		//LinkedList<String> l=new LinkedList <string>();
		LinkedList l =new LinkedList();
		//Add element into LinkedList
		l.add(100);
		l.add("gaurav");
		l.add(true);
		l.add(21.5);
		l.add(-32);
		l.add(null);
		System.out.println(l);      //[100, gaurav, true, 21.5, -32, null]
		
		
		//size of linkedlist
		System.out.println(l.size());  //6
		
		//remove
		l.remove(2);      //index
		
		
		//inserting element in the middle of linked list
		l.add(3,"java");
		
		System.out.println(l);
		
		// retreiving value/object
		System.out.println(l.get(3));
		
		
		//change the value
		l.set(4, "python");
		
		System.out.println("after changing the value"+l);
		
		//contains
		System.out.println(l.contains("java"));
		System.out.println(l.contains("mongo"));
		
		//isEmpty
		System.out.println(l.isEmpty());

		
		//Reading elelment from liked list using for loop
		
		for(int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i));
		}
		
		
		
		// for each loop
		for(Object e:l) {
			System.out.println(e);
		}
		
		
		//iteratot() method
		
		Iterator it=l.iterator();
		while(it.hasNext());
		{
			System.out.println(it.next());
		}
		
		
		LinkedList new_l=new LinkedList();
		new_l.add("D");
		new_l.add("C");
		new_l.add("B");
		new_l.add("A");
		
		
		System.out.println("new array list ="+l);

		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
	}
	
	
}
