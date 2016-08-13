package com.vivek;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		for(int i =2;i<n;i++){
			sum = a +b;
			System.out.println(sum);
			a =b;
			b=sum;
			
		}
	}

}
