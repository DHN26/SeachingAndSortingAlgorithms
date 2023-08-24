package com.kodnest.arrayprograms;

public class BinarySearchMethod {

	
		void method(int n,int arr[]) {
			int mid,low,high;
			low=0;
			high=arr.length;
			while(low<=high) {
				mid=(low+high)/2;
				
				if(n==arr[mid]) {
					System.out.println("Key found at index "+mid);
					return;
				}
				else if(n>arr[mid])
				{
					low=mid+1;
					
				}
				else
					high=mid-1;
			}
			System.out.println("Key not found");
			
				
			
		}

	}


