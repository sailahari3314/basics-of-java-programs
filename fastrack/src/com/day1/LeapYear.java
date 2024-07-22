package com.day1;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter year:");
	int year=sc.nextInt();
	boolean isleap=(year%4==0&&year%100!=0)||(year%400==0);
	if(isleap) {
		System.out.println("this is leap year");
	}
	else {
		System.out.println("this is not leap year");
	}
}
}
