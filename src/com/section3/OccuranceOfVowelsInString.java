package com.section3;

public class OccuranceOfVowelsInString {
	public static void main(String[] args) {
		String s="Education";
		s=s.toLowerCase();
		String vowels="aeiou";
		for(int i=0; i<vowels.length(); i++)
		{
			char ch1=vowels.charAt(i);
			int count=0;
			for(int j=0; j<s.length(); j++)
			{
				char ch2=s.charAt(j);
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
