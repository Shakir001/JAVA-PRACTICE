package com.section3;

public class LengthOfString_withoutUsingLength {
	public static void main(String[] args) {
		String s="Selenium";
		char[] ch=s.toCharArray();
		int count=0;
		for (char c : ch) 
		{
			System.out.println(c);
			count++;
		}
		System.out.println("Length of the String: "+count);
	}
}
