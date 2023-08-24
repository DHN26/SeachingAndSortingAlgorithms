package com.kodnest.arrayprograms;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("Array before sorting : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//In ascending order
		SelectionSortMethod ss=new SelectionSortMethod();
		ss.method(arr);
		System.out.println("Array after sorting in ascending order: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		//In descending order
		SelectionSortDescendingOrder sd=new SelectionSortDescendingOrder();
		sd.method(arr);
		System.out.println("Array after sorting in descending order : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		

	}

}
