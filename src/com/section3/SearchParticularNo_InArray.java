package com.section3;

public class SearchParticularNo_InArray {
	public static void main(String[] args) {
		int[] X= {12,56,89,23,24,36,88};
		int num=23;
		boolean flag=false;
		for(int i : X)
		{
			if(i==num)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+" is present");
		}
		else
		{
			System.out.println(num+" is not present");
		}
	}
}
