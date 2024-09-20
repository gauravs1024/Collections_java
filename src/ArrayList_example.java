
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class ArrayList_example {
public static void main(String[] args) {
	// Declare array list
	ArrayList al=new ArrayList();
	//ArrayList<String> al =new ArrayList<integer>();
	//List al =new ArrayList();>>>>
	
	// Add new element to the arrayList
	al.add(100);
	al.add("welcome");
	al.add(15.5);
	al.add('A');
	al.add(true);
	
	System.out.println(al);     //[100, welcome, 15.5, A, true]
	System.out.println("size ="+al.size());     //size = 5
	al.remove(1);					//here 1 is index 
	al.remove("welcome");			//welcome is element
	
	
	System.out.println("after removing elements "+al);      //after removing elements [100, 15.5, A, true]
	
	// Insert a new element
	//add(index,object)
	al.add(2,"python");
	 System.out.println("After Insertion  ="+al);			//After Insertion  =[100, 15.5, python, A, true]
	 
	 
	 // retreive specific element
	 System.out.println(al.get(2));							//python here 2 is index of element/object
	 
	 //change element/replace
	 al.set(2, "C#");
	 System.out.println("after replacing element"+al);		//after replacing element[100, 15.5, C#, A, true]
	 
	 
	 //Search - contains()  retruns true/false
	 System.out.println(al.isEmpty());     //false
	 
	 
	 
	 // For loop
	 System.out.println("printing by for looop");
	 for(int i=0;i<al.size();i++) {
		 System.out.println(al.get(i));
	 }
	 
	 
	 // For each loop
	 System.out.println("printing by for  each looop");

	 for(Object e:al) {
		 System.out.println(e);
	 }
	 
	 
	 //iterator
	 System.out.println(" Printing Element by iterator ");
	 Iterator it=al.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 
	 
	 ArrayList new_al=new ArrayList();
	 new_al.add("X");
	 new_al.add("Y");
	 new_al.add("P");
	 new_al.add("@");
	 new_al.add("#");
	 new_al.add("D");
	 
	 System.out.println("New Array list:"+new_al);   		            	//New Array list:[X, Y, P, @, #, D]
	 al.addAll(new_al);
	 System.out.println("After Adding the all Elemnts = "+al);              //After Adding the all Elemnts = [100, 15.5, C#, A, true, X, Y, P, @, #, D]
	 al.removeAll(new_al);
	 System.out.println("After removing all elemnts of new array"+al);      //After removing all elemnts of new array[100, 15.5, C#, A, true]
	 
	 //Sorting -----Collections.sort()
	 System.out.println("Before the Sorting of Element"+new_al);	     	//Before the Sorting of Element[X, Y, P, @, #, D]
	 
	 Collections.sort(new_al);
	 
	 System.out.println("After the Sorting of Element"+new_al);		       	//After the Sorting of Element[#, @, D, P, X, Y]
	 //Reverse-------sorting
	 Collections.sort(new_al,Collections.reverseOrder());
	 
	 System.out.println("After the Sorting of Element in reverse order ="+new_al);		//After the Sorting of Element in reverse order =[Y, X, P, D, @, #]
	 
	 
	 System.out.println("Before Shuffling "+new_al);

	 
	 //Shuffling - Collections.shuffle()
	 Collections.shuffle(new_al);			// Before Shuffling [Y, X, P, D, @, #]

	 System.out.println("After Shuffling "+new_al);    //After Shuffling [P, X, @, D, Y, #]
	 
	 
	 //Converting array to ArrayList
	 String arr[]= {"Gaurav","chandan","neetu","Bhoomika"};
	 System.out.println("Elements of the array");
	 for(String a:arr) {
		 System.out.println(a);
	 }
	 
	 ArrayList al_p=new ArrayList(Arrays.asList(arr));
	 System.out.println(al_p);                           //[Gaurav, chandan, neetu, Bhoomika]

	 
	 



	 


	 
	 
	 
	 
	
	
	
	
	
	
	
	}
}
