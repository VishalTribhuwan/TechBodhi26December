package statickeywordexample;

public class staticvariableexample {
	
	//int count =0;
	
	static int count;
	
	staticvariableexample()
	{
		
		count++;
	}
	
	void getcount()
	{
		System.out.println("Value of counter:"+count);
	}
	
	public static void main(String[] args) {
		
		staticvariableexample st1 = new staticvariableexample();
		st1.getcount();
		
		staticvariableexample st2 = new staticvariableexample();
		st2.getcount();
		
		
		
		
	}

}
