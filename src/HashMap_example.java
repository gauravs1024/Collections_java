import java.util.HashSet;

public class HashMap_example {
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
		

		
	}
}
