package conditionalstatements;

import java.util.Scanner;

public class ifelseexample {
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);             //Scanner:- Used for taking output frm User
		System.out.println("Please enter a number");
		
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
	}

}
