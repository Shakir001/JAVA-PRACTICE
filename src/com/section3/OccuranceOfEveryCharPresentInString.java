package com.section3;

public class OccuranceOfEveryCharPresentInString {
	public static void main(String[] args) {
		String s="Mahabharat";
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			char ch1=s.charAt(i);
			
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				char ch2=s.charAt(j);
				
				if(ch1==ch2 && i>j)
				{
					break;
				}
				if(ch1==ch2)
				{
					count++;
				}
				
			}
			if(count>0)
			{
				System.out.println(ch1+" present "+count+" times ");
			}
		}
	}
}
