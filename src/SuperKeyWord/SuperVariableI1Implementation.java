package SuperKeyWord;

public class SuperVariableI1Implementation {

	String abc ="I am in Child/derived Class";
	
	void display()
	{
		System.out.println(abc);
		System.out.println(super.abc);
	}
	
	public static void main(String[] args) {
		
		SuperVariableI1Implementation sp = new SuperVariableI1Implementation();
		sp.display();
		
		
	}
}
