package com.day1;
import java.util.Scanner;
public class Factorial{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num:");
	int a=sc.nextInt();
	int fact=1;
	for(int i=1;i<=a;i++) {
fact*=i;
	}
	System.out.println("fact of "+a+" is "+fact);
}
}
