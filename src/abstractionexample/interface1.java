package abstractionexample;

public interface interface1 {
	
	
//  intx;   //Compile time error----interface variables must be initialized at the	
	int a=10; // same as-----public static final int a=10;
	
	public void method1();      // -----Same as public abstract void method1();
	public void method2();     //-------Same as public abstract void mehtod2();
}

