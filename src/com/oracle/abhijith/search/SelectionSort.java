package com.oracle.abhijith.search;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4,2,6,8,9,22,0,1};
		doSelectionSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
	private static int getMinValueIndex(int[] arr, int start) {
		int minVal = arr[start];
		int minValIndex = start;
		for (int i=start;i<arr.length;i++) {
			if(minVal>arr[i]) {
				minVal = arr[i];
				minValIndex = i;
			}
		}
		return minValIndex;
	}
	
	private static void swapElement(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] =  arr[end];
		arr[end] = temp;
	}
	
	public static void doSelectionSort(int[] arr) {
		
		for (int i=0; i< arr.length ; i++) {
			int smallValueIndex = getMinValueIndex(arr, i);
			swapElement(arr, i, smallValueIndex);
		}
		
	}

}
