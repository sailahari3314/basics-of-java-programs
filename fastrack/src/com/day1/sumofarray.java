package com.day1;
import java.util.Scanner;
public class sumofarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("length:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	System.out.println("enter elements:");
	for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int num:arr) {
		sum+=num;
	}System.out.println("sum of elements in array: "+sum);
}
}
