package com.section1;

public class Abcd {
	public static void main(String[] args) {
		try
		{
			 System.out.println("try running");
	//		 System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch running");
			
		}
		finally
		{
			System.out.println("finally running");
			
		}
	}
}
