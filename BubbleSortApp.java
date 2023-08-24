package classprograms;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("Array before sorting in ascending order : ");
		for (int i : arr) {
			System.out.println(i+" ");
		}
		
		BubbleSortMethod bm=new BubbleSortMethod();
		bm.method(arr);
		
		System.out.println("Array after sorting :");
		for (int i : arr) {
			System.out.println(i+" ");
		}
		
		//Descending order sort
		BubbleSortMethodDescendingOrder bm1 =new BubbleSortMethodDescendingOrder();
		bm1.method(arr);
		
		System.out.println("Array after sorting in descending order :");
		for (int i : arr) {
			System.out.println(i+" ");
		}
		
	}

}
