import java.util.Iterator;
import java.util.PriorityQueue;

import org.w3c.dom.ls.LSOutput;

public class Queuedemo {
		public static void main(String[] args) {
			PriorityQueue q=new PriorityQueue();
			
			// Adding elements add() offer()
			q.add("A");
			q.add("B");
			q.offer("C");
			q.offer("D");
			
			System.out.println(q);
			
			//get head element  element()  peek()
			System.out.println(q.element());// if queue is empty it throws error			
			System.out.println(q.peek());	// if queue is empty it gives null
			
			// return and remove elements  from queue	remove()  poll()
			System.out.println(q.remove());		// if queue is empty it throws exception
			System.out.println(q);
			System.out.println(q.poll());		//// if queue is empty it will return
			System.out.println(q);
			
			// read all the elements from the queue using the itertaor
			Iterator itr=q.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
				
				
			// reading all the elements using the for loop
			for(Object e:q)
			{
				System.out.println(e);
				}
			
			
			
			// Note all the other methods of linked list are implemented
			// Heterogeneous data is not allowed
			//insertion order is preserved
			//queue methods also implemented by the linked list like poll(), remove(),element(),
			
			
			
			
			
			
			
			
			
		}
		
		
	
}
