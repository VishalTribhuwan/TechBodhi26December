package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapExample {
	
	public static void main(String[] args) {
		Map map=new HashMap ();
		//Adding elements to map
		map.put(1,"Amit");
		//map.put(1,"Raj");
		map.put(5,"Rahul");
		map.put(2,"Jai");
		map.put(6,"Amit");
		System.out.println(map.get(1));
		//Traversing Map
		Set set=map.entrySet();   //Converting to set so that we can traverse
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			//Converting to Map.Entry so that we can get key and value seperate
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
	}


