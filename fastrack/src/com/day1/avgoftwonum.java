package com.day1;
import java.util.Scanner;
public class avgoftwonum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers:");
	Double a=sc.nextDouble();
	Double b=sc.nextDouble();
	Double c=(a+b)/2;
	System.out.println("average of "+a+" and "+b+" is "+c);
}
}
