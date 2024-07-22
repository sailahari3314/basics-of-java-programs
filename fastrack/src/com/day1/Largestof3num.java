package com.day1;
import java.util.Scanner;
public class Largestof3num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int l;
	if(a>=b&&a>=c) {
		l=a;
		
	}
	else if(b>=a&&b>=c) {
		l=b;
	}
	else {
		l=c;
	}
	System.out.println("largest number is: "+l);
}
}
