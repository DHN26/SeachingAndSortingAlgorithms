package com.kodnest.arrayprograms;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		InsertionSortMethod is=new InsertionSortMethod();
		is.method(arr);
		System.out.println("Array after sorting : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
