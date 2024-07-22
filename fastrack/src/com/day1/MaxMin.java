package com.day1;
import java.util.Scanner;
public class MaxMin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,max,min;
	System.out.println("length:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	System.out.println("enter elements:");
	for(i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	max=arr[0];
	 min=arr[0];
	for(i=1;i<n;i++) {
	
		if(arr[i]> max){
		max=arr[i];
	}
	if(arr[i]<min) {
		min=arr[i];
	}}
	System.out.println("min and max numbers are: "+min+" and "+max);
}
}
