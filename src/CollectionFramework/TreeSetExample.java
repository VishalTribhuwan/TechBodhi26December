package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
	
public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
		       set.add("One");
		       set.add("Two");
		       set.add("Three");
		       set.add("Four");
		       set.add("Five");
		      // set.add("null");      Null Value not allowed in TreeSet
		       set.add("One");
		      // set.add("null");
		       Iterator<String> i=set.iterator();
		       while(i.hasNext())
		       {
		    	   System.out.println(i.next());
		    	   
		       }
	}

}




