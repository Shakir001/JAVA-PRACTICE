package com.section3;

public class ReverseString_usingStringBuffer {
	public static void main(String[] args) {
		String s="Education";
		StringBuffer sb=new StringBuffer(s);
		s=sb.reverse().toString();
		System.out.println(s);
	}
}
