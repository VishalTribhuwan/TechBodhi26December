package exceptionhandling;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class checkedexception2 {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = null;
		fis = new FileInputStream("C:\\Sticky Notes\\A.txt");
		// fis = new FileInputStream("C:\\Sticky Notes\\A.txt");
		int k;
		
		while(( k = fis.read() ) != -1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
		
		
		
	}
	


