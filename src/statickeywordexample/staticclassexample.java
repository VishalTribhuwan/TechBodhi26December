package statickeywordexample;

public class staticclassexample {

	static String abc = "hello Alexa";
	String cde = "Hello Google";
	
	static class innerclassstatic
	{
		static void print()
		{
			System.out.println(abc);
			// System.out.println(cde);  // can not access the outer class non static 
		}
		
		void method1()
		{
			System.out.println("method1");
		}
	}
	
	public static void main(String [] args)
	{
		
		staticclassexample.innerclassstatic.print(); // same as innerclassstatic
		staticclassexample.innerclassstatic in = new staticclassexample.innerclassstatic();
		in.method1();
		
		staticclassexample st2 = new staticclassexample();
		        System.out.println(st2.cde);
	}
	}
