package com.cubic.shubham;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrime(long number){
		boolean isPrime=true;
		for(long i = 2 ; i<number/2; i++ ){
			if(number % i==0){
				isPrime = false;
				break;
			}
			
		}
		return isPrime;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		if(checkPrime(number)){
			System.out.println("Given number is Prime Number");
		}
		else {
			System.out.println("Given Number is Composite Number");
		}
	}

}
