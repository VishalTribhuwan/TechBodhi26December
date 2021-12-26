package thiskeyword;

public class thiskeywordexample {
	
	int rollno;
	String name;
	float fee;
	
	thiskeywordexample(int rollno,String name,float fee)
	{
		this.rollno=rollno;  // change now to this.rollno=rollno
		this.name=name;   // change to this.name = name
		this.fee=fee;     // change to this. fee=fee
	}
	void display()
	{
		
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	public static void main(String[] args) 
	{
		thiskeywordexample th1 = new thiskeywordexample(12345,"Vishal",25000);
		thiskeywordexample th2 = new thiskeywordexample(6759,"Raj",30000);
		th1.display();
		th2.display();
		}
	}
