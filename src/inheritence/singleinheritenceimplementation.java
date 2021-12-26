package inheritence;

public class singleinheritenceimplementation extends singleinheritence {
	
	float bonus = 40000;
	
	void cde()
	{
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		
		singleinheritenceimplementation sh = new singleinheritenceimplementation();
		System.out.println(sh.salary);
		System.out.println(sh.bonus);
		
		sh.abc();
		sh.cde();
		
	}

}
