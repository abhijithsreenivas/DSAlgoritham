package com.oracle.abhijith.search;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = { 4, 2, 6, 8, 9, 22, 0, 1 };
		quickSort(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr1));

	}
	
	
	private static void swapElement(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
	}
	
	private static int getPartitionIndex(int[] arr, int left, int right) {
		int pivot = arr[(left+right)/2];
		while(left<=right) {
			
			while(arr[left]<pivot)
					left++;
			while(arr[right]>pivot)
					right--;
			if(left<=right) {
				swapElement(arr, left, right);
				left++;
				right--;
			}
		}
		
		return left;
	}

	
	private static void quickSort(int[] arr, int left, int right) {
		int index = getPartitionIndex(arr, left, right);
		if(left < index-1) 
			quickSort(arr, left, index-1);
		if(index < right)
			quickSort(arr, index, right);
		
	}
}
