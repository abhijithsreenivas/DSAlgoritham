package com.oracle.abhijith.search;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {4,2,6,8,9,22,0,1};
		doBubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}
	
	private static void swapElement(int[] arr, int old, int newP) {
		int temp = arr[old];
		arr[old] = arr[newP];
		arr[newP] = temp;
				
	}
	
	public static void doBubbleSort(int[] arr) {
		int len = arr.length;
		
		while(len >= 0) {
			
			for(int i=0; i< arr.length-1; i++) {
				if(arr[i] > arr[i+1])
					swapElement(arr, i+1, i);
			}
			
			len--;
		}
			
	}

}
