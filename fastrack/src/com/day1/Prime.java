package com.day1;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num: ");
	int a=sc.nextInt();
	boolean isPrime=true;
	if(a<= 0) {
		isPrime=false;
	}
	else {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0)
			{
				isPrime=false;
			}
		}
	}
	if(isPrime) {
		System.out.println("prime number");
	}
	else {
		System.out.println("not prime number");
	}
}
}
