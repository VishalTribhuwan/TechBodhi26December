package variableexamples;

public class staticvariableexample {
	
	int rollNumber;
	String name;
	static String collegename = "MIT"; // this is static variable will get memory on 
	
	staticvariableexample(int r, String n)
	{
		rollNumber = r;
		name = n;
	}
	
	void ToPrint() {
		
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(collegename);
		
	}
	
	public static void main(String[] args) {
		
		staticvariableexample st1 = new staticvariableexample(123456,"Vishal");
		staticvariableexample st2 = new staticvariableexample(789845,"Rajkumar");
		st1.ToPrint();
		st2.ToPrint();
		
	}
	}


