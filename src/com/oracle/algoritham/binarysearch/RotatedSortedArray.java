package com.oracle.algoritham.binarysearch;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4, 5, 6, 7, 1, 2, 3 };
		System.out.println(doRotatedSearchArray(arr1, 3));
	}

	private static int binarySearch(int[] arr, int key, int start, int end) {
		if (end >= start) {
			int mid = (start + end) / 2;
			if (arr[mid] == key)
				return mid;
			return (key < arr[mid]) ? binarySearch(arr, key, start, mid) : binarySearch(arr, key, mid + 1, end);
		} else {
			return -1;
		}

	}

	private static int getPivotIndex(int[] arr, int start, int end) {
		if (end > start) {
			int mid = (start + end) / 2;
			if (mid > start && mid < end) {
				if (arr[mid] < arr[mid - 1])
					return mid;
				if (arr[mid + 1] < arr[mid])
					return mid + 1;
				return (arr[start] > arr[mid]) ? getPivotIndex(arr, start, mid) : getPivotIndex(arr, mid + 1, end);
			}
		}
		return -1;

	}

	public static int doRotatedSearchArray(int[] arr, int key) {
		int pivotIndex = getPivotIndex(arr, 0, arr.length - 1);
		if (pivotIndex != -1) {
			if (arr[pivotIndex] == key)
				return pivotIndex;
			if (key > arr[arr.length - 1])
				 return binarySearch(arr, key, 0, pivotIndex);
			else
				return binarySearch(arr, key, pivotIndex+1, arr.length - 1);
		}else {
			return pivotIndex;
		}
		
		
	}

}


/** OUTPUT 
 * 
 * 6
 * 
 * **/

