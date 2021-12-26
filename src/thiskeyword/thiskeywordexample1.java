package thiskeyword;

public class thiskeywordexample1 {
	
	void method1()
	{
		System.out.println("Hello");
	}
	
	void method()
	{
		System.out.println("method2");
		this.method1();
		method1();  // this is same as this.method
	}
	public static void main(String[] args) {
		
		thiskeywordexample1 th3 = new thiskeywordexample1();
		      th3.method();
		      
	}

}
