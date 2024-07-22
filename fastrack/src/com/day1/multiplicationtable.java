package com.day1;
import java.util.Scanner;
public class multiplicationtable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();
	System.out.println("enter range: ");
	int r=sc.nextInt();
	System.out.println("Multiplication table of "+n+":");
	for (int i=1;i<=r;i++)
{
		System.out.println(n+"*"+i+"="+(n*i));		
}
}
}
