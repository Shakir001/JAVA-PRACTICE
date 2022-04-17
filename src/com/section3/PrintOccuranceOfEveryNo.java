package com.section3;

public class PrintOccuranceOfEveryNo {
	public static void main(String[] args) {
		int[] X= {24,34,24,12,13,12,34};
		for(int i=0; i<X.length; i++)
		{
			int count=0;
			for(int j=0; j<X.length; j++)
			{
				if(X[i]==X[j] && i>j)
				{
					break;
				}
				if(X[i]==X[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(X[i]+" present "+count+" times");
			}
		}
	}
}
