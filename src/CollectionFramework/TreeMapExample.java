package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {
	
	public class LinkedHashMapExample {
		
		public void main(String[] args) {
			
			TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
			hm.put(100,"Amit");
			hm.put(105,"Vijay");
			hm.put(102, "Rahul");
			System.out.println("Initial list of elements:");
			for(Map.Entry m:hm.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
			
			}
				
			
		}


}
