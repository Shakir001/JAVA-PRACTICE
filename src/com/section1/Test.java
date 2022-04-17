package com.section1;

public class Test {
	public static void main(String[] args) {
		int[]X=new int[5];
		X[0]=10;
		X[1]=20;
		X[3]=30;
		X[4]=40;
		for (int i : X) 
		{
			System.out.println(i);
		}
		System.out.println(X.length);
  }
}