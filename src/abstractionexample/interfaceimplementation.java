package abstractionexample;

public class interfaceimplementation implements interface1{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
		
	}
	
	public static void main(String[] args) {
		
		// a=20; ---------can not change the value as it is final
		
		System.out.println(a);
		interface1 if1 = new interfaceimplementation();
		if1.method1();
		if1.method2();
	}

}
