package statickeywordexample;

public class staticmethodexample {
	
	int a = 10;
	static int b = 20;
	
	static void abc()
	{
		//System.out.println(a); // static method can not access non static method
		System.out.println(b);
	}
	
	void cde() // non static method can access both static and non static variable
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(a); // can not access as main method is also static method
		staticmethodexample sm1 = new staticmethodexample();
		System.out.println(sm1.a);
		System.out.println(b);
		
		staticmethodexample.abc();
		//cde(); // not possible as cde is not static method
		sm1.cde();

	}

}
