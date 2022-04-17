package com.section3;

public class ToReverseString {
	public static void main(String[] args) {
		String s="Mahabharat";
		String rev=" ";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Original string: "+s);
		System.out.println("Reverse string: "+rev);
	}
}
