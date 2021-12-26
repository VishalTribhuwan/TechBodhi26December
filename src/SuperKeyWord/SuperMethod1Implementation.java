package SuperKeyWord;

public class SuperMethod1Implementation {
	
	void display()
	{
		System.out.println("child/derived class method");
	}
	
	void print()
	{
		super.display();
		display();
	}
	
	public static void main(String[] args) {
		
		SuperMethod1Implementation sm = new SuperMethod1Implementation();
		sm.print();
	}

}
