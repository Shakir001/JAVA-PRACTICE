package com.section3;

public class ReverseArray {
	public static void main(String[] args) {
		int[] X= {12,24,11,30,32,40};
		int[]revArr=new int[X.length];
		int count=0;
		for(int i=X.length-1; i>=0; i--)
		{
			revArr[count++]=X[i];
		}
		System.out.println("Reverse Array: ");
		for (int z : revArr) 
		{
			System.out.print(z+" ");
		}
	}
}
