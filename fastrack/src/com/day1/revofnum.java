package com.day1;
import java.util.Scanner;
public class revofnum {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int rev=0;
while(n!=0) {
	int digit=n%10;
	rev=rev*10+digit;
	n/=10;
	
}
System.out.println("revese of the number:"+rev);
}
}
