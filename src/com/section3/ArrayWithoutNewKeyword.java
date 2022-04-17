package com.section3;

public class ArrayWithoutNewKeyword {
	public static void main(String[] args) {
		int[] X= {10,20,30,40};
		//fetch the data
		System.out.println(X[0]);
		System.out.println(X[3]);
		//fetch all the data
//		for(int i:X)
//		{
//			System.out.println(i);
//		}
		for(int i=0; i<X.length; i++)
		{
			System.out.println(X[i]);
		}
	}
}
