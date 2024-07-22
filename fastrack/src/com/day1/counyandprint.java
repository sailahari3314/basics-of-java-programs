package com.day1;
import java.util.Scanner;
public class counyandprint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	int count=0;
	int temp=n;
	while(temp!=0) {
		temp/=10;
		count++;
		
	}
	System.out.println("number of digits: "+count);
	
}
}
