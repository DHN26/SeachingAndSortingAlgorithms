package com.kodnest.arrayprograms;
import java.util.Scanner;
public class LinearSearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the key element");
		int key=scan.nextInt();
		System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		LinearSearchMethod l=new LinearSearchMethod();
		int res=l.method(arr,key);
		if(res>0)
			System.out.println("Key found at index : "+res);
		else
			System.out.println("Key not found");
				
	}

}
