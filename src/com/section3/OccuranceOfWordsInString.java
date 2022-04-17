package com.section3;

public class OccuranceOfWordsInString {
	public static void main(String[] args) {
		String s="Today is good day and tomorrow also good day";
		String[] str=s.toLowerCase().split(" ");
		for(int i=0; i<str.length; i++)
		{
			int count=0;
			for(int j=0; j<str.length; j++)
			{
				if(str[i].equals(str[j]) && i>j)
				{
					break;
				}
				if(str[i].equals(str[j]))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(str[i]+" present"+count+" times");
			}
		}
	}
}
