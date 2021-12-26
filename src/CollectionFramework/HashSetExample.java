package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		//Creating HashSet and adding elements
		HashSet<String> set=new HashSet();
		       set.add("One");
		       set.add("Two");
		       set.add("Three");
		       set.add("Four");
		       set.add("Five");
		       set.add("null");
		       set.add("One");
		       set.add("null");
		       Iterator<String> i=set.iterator();
		       while(i.hasNext())
		       {
		    	   System.out.println(i.next());
		    	   
		       }
	}

}
