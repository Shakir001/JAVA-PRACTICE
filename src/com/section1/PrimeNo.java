package com.section1;

public class PrimeNo {
	public static void main(String[] args) {
		int num=71;
		int count=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is not prime number");
		}
	}
}
