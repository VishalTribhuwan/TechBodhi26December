package constructorexample;

public class parameterizedconstructor {
	
	int id;
	String name;
	
	parameterizedconstructor(int i, String n)
	{
		id =i;
		name = n;
	}
	
	void display()
	{
		System.out.println(name+" " +id);
		
	}
	
	public static void main(String args[]) {
		
		
		parameterizedconstructor ds1 = new parameterizedconstructor(305313, "Vishal");
		parameterizedconstructor ds2 = new parameterizedconstructor(301012, "Raj");
		ds1.display();
		ds2.display();
	}
	
	}


