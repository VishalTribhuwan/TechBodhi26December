package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String [] args) {
		
		List<String> ar = new ArrayList<String>();
		ar.add("Rajkumar");
		ar.add("Vishal");
		ar.add("Ram");
		ar.add("Sanjay");
		ar.add("Sanjay");
		ar.add(null);
		ar.add(null);
		//ar.add(10);
		ar.add("..........");
		
		// First way iterator
		
		Iterator<String> it =ar.iterator();
		
		//while(it.hasNext())
		//{
			//System.out.println(it.next());
		//}
		
		// Second Way (ForEach Loop)
		
	for (String ab:ar)
	{
		System.out.println(ab);
	}
	
	// Third Way (For Loop)
	
	System.out.println("Traversing List through for loop:");
	for(int i=0;i<ar.size();i++)
{
	System.out.println(ar.get(i));
}
}
}