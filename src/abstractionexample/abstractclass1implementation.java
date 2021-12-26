package abstractionexample;

public class abstractclass1implementation extends abstractclass1 { //Use Suggestion Link

	@Override
	public void abstractmethod1() {
		// TODO Auto-generated method stub
		
		System.out.println("abstract method 1 implemention");
		
	}
	
	public static void main(String args []) 
	{
		//abstractclass1 ab = new abstractclass1(); //can not create the instance
		
		abstractclass1 ab1 = new abstractclass1implementation();
		ab1.abstractmethod1();
		ab1.simplemethod();
		
		abstractclass1implementation abc = new abstractclass1implementation();   //Its optional way to run 
		abc.abstractmethod1();
		abc.simplemethod();
		
	}

}
