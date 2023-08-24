package com.kodnest.arrayprograms;
import java.util.Scanner;
public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the key element");
		int key=scan.nextInt();
		
		BinarySearchMethod bs=new BinarySearchMethod();
		bs.method(key,arr);
		

	}

}
