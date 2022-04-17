package com.section3;

public class CheckStringPalindrome {
	public static void main(String[] args) {
		String s="Malayalam";
		s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Original String: "+s);
		System.out.println("Reverse String: "+rev);
		if(s.equals(rev))
		{
			System.out.println("It is a Palindrome string");
		}
		else
		{
			System.out.println("It is not a Palindrome String");
		}
		
	}
}
