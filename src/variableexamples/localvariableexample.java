package variableexamples;

public class localvariableexample {
	
	// This is instance variable as it is not inside any of the method block
	String instancevariable = "This is instance variable";
	
	public void firstmethod()
	{
		// This is local variable as it is inside the method
		String localvariable = "This is local variable";
		
		//access modifier can not assign for local variable
		//public String abc1 ="access modifier can not assign for local variable";
		
		//static can not be used for local variable
		//static String abc ="static can not used for local variable";
		
		//Value should be assign before first use of local variable
		//String NoAssignValue;
		//System.out.println(NoAssignValue);
		
		System.out.println(localvariable);
		System.out.println();
}
	public static void main(String args[])
	{
		localvariableexample vishal = new localvariableexample();
		System.out.println(vishal.instancevariable);
		vishal.firstmethod();
	}
	
	
	
	
}