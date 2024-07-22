package com.day1;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num:");
	int a=sc.nextInt();
	if(a%2==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
}
}
