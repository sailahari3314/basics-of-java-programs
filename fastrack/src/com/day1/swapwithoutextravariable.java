package com.day1;
import java.util.Scanner;
public class swapwithoutextravariable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(" after swap :"+a+" "+b);
	
}
}
