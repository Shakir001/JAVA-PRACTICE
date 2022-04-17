package com.section3;

public class ToRemoveSpacesInString {
	public static void main(String[] args) {
		String s="java is a very easy programming language";
		System.out.println("Before: "+s);
		s=s.replace(" ", "");
		System.out.println("After: "+s);
	}
}
