package com.oracle.algoritham.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 3, 4, 5, 6, 7};
		System.out.println(binarySearch(arr1, 16, 0, arr1.length));

	}
	
	public static int binarySearch(int[] arr, int key, int start, int end) {
		
		if(end > start) {
			int mid = (start+end)/2;
			if(arr[mid]==key)
				return mid;
			return (key < arr[mid]) ? binarySearch(arr,key,start,mid) : binarySearch(arr,key,mid+1,end);
			
		}else {
			return -1;
		}
		
		
	}

}
