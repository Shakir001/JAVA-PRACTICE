package com.section3;

public class PrintSumAndAvgOfArray {
	public static void main(String[] args) {
		int[] X= {10,20,30,40,50};
		int sum=0;
		double avg=0;
		for(int i : X)
		{
			sum=sum+i;
		}
		System.out.println("The sum of array is: "+sum);
		avg=sum/X.length;
		System.out.println(avg);
	}
}
