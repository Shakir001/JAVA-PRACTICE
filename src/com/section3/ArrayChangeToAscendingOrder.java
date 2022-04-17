package com.section3;

public class ArrayChangeToAscendingOrder {
	public static void main(String[] args) {
		int[] X= {12,24,11,30,15,35,22};
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
		for(int z : X)
		{
			System.out.print(z+" ");
		}
	}
}
