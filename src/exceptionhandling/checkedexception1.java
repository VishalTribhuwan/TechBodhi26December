package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class checkedexception1 {
	
	public static void main(String[] args) {
		
		FileInputStream fs=null;
		
		try {
			fs= new FileInputStream
			("C:\\Sticky Notes\\A.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			//fs = new FileInputStream("C:\Sticky Notes\\A.txt");
			fs = new FileInputStream("C:\\Sticky Notes\\A.txt");
			
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("The specified file is not " + "present at the given path");
		}
		
		int k;
		try {
			while((k = fs.read() ) !=-1)
			{
			  System.out.println((char)k);
			}
			fs.close();
		}catch(IOException ioe){
			System.out.println("I/O error occured: "+ioe);
			
			}
		}
		
		}
	


