package thiskeyword;

public class thiskeywordexample2 {
	
	void method1()
	{
		System.out.println("Hello");
	}
	
	void method2()
	{
		System.out.println("method 2");
		this.method1();
		method1();   // this is same as this.method1
	}
	public static void main(String[] args) {
		
		thiskeywordexample2 th3 = new thiskeywordexample2();
		    th3.method2();
	}

}
