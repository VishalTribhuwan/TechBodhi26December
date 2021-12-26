package conditionalstatements;

public class switchcaseprogram {
	public static void main(String args[]) {
		int num=100;
		switch(num) {
		
		case 100:
			System.out.println("Value of case 1 is "+num);
			//need to use break else it will go to the next conditional as well 
			//break;
		case 200:
			System.out.println("Value of case 2 is "+num);
			//break;
		default:
				System.out.println("Value of default is "+num);
		}
	}

}
