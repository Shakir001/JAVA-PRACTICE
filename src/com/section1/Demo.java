package com.section1;

public class Demo {
	public static void main(String[] args) {
		String s="Education";
		char[] ch=s.toLowerCase().toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(char z : ch)
		{
			System.out.print(z+" ");
		}
	}
}
