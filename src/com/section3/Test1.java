package com.section3;

public class Test1 {
	public static void main(String[] args) {
		int[] X= {12,56,89,23,24,36,88};
		for(int i=0; i<X.length; i++)
		{
			for(int j=i+1; j<X.length; j++)
			{
				if(X[i]>X[j])
				{
					int temp=X[i];
					X[i]=X[j];
					X[j]=temp;
				}
			}
		}
		System.out.println("lowest no: "+X[0]);
		System.out.println("highest no: "+X[X.length-1]);
	}
}