package polymorphism;

public class methodoverridding1implementation extends methodoverridding {
	
	int speedlimit = 150;                           // over ridding can not achieved on data member
	void abc()
	{
		System.out.println("extended class");
	}
	
	void cde()
	{
		System.out.println(speedlimit);
		System.out.println(super.speedlimit);       //Its used for Super class methods
	}
	
	public static void main(String[] args) {
		
		methodoverridding mr = new methodoverridding1implementation(); // dynamic
		System.out.println(mr.speedlimit);
		mr.abc();
		
		methodoverridding1implementation mr1  = new methodoverridding1implementation();
		System.out.println(mr1.speedlimit);
		mr1.abc();
		mr1.cde();
		//
		
	}
	}
	


