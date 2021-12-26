package constructorexample;

public class defaultconstructorexample2 {
	
	int id;
	String name;
	
	void display()
	{
		System.out.println(id + " " + name);
	}
	
	public static void main(String args []) {
		
		defaultconstructorexample2 ds1 = new defaultconstructorexample2();
		defaultconstructorexample2 ds2 = new defaultconstructorexample2();
		ds1.display();
		ds2.display();
	}
		
	}