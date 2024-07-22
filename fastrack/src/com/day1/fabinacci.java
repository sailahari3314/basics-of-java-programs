package com.day1;
import java.util.Scanner;
public class fabinacci {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num:");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	System.out.println("fabinocci series of "+n+" is "+a+" "+b);
	for (int i=0;i<=n;++i) {
		
		int c=a+b;
		a=b;
		b=c;
		System.out.println(a);
		//System.out.println(b);
	}
	
}
}
