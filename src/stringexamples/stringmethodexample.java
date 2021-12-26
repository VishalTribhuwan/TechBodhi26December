package stringexamples;

public class stringmethodexample {
	
	public static void main(String [] args) {
		
		String s ="My name is Vishal Tribhuwan";
		
		//1. Length method
		int lngth = s.length();
		System.out.println("Length of string is -"+lngth);
		
		//2. charAt method
		char charatt=s.charAt(5);
		System.out.println("Character at perticular index:-"+charatt);
		
		//3. Substring
		String fullName=s.substring(11);
		System.out.println("Substring:-"+fullName);
		String Name = s.substring(11, 19);
		System.out.println("Substring:-"+Name);
		
		//4. equals Method
		String s1="Vishal";
		String s2="Raj";
		System.out.println("Equals Method:-"+s1.equals(s2));
		
		//5. contains Method
		System.out.println("contains Method:-"+s1.contains(s2));
		
		// index of, last indexof
		System.out.println("Index of Method 1:"+s.indexOf('a'));
		System.out.println("Index of Method 2:"+s.indexOf('a', 6));
		System.out.println("Index of Method 3:"+s.indexOf("Vishal"));
		System.out.println("Last Index of Method 1:"+s.indexOf('a'));

	    //6. conact
		String con1="Vishal";
		String con2="Tribhuwan";
		System.out.println("Concat :-"+con1.concat(con2));
		
		//7. Replace Method
		System.out.println("Replace:-"+s.replace("Vishal", "Raj"));
		
		//8. uppercase lowercase
		System.out.println("Uppercase:-"+s.toUpperCase());
		System.out.println("Lowercase:-"+s.toLowerCase());
		
		
		//9. split method
		String[] splt = s.split(" ");
		for(String a:splt) {
			{
				System.out.println("eachvalue of splitted string:---"+a);
			}
		}
	
		//10. join
		String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven");
		System.out.println("JoinExample-----"+gfg1);
		
			}
		}
	


