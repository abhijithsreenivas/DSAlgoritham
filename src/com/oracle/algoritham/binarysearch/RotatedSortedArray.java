package com.oracle.algoritham.binarysearch;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {4,5,6,7,1,2,3};
		//System.out.println(getRotatedSortedArraySearch(arr1, 7, 0, arr1.length-1));
	}
	
	private static int getPivotElement(int[] arr,int start, int end) {
		if(end>start)
			return -1;
		if(end==start)
			return start;
		int mid=(end+start)/2;
		if(arr[mid]<arr[end] && arr[mid] > arr[mid+1])
			return mid+1;
		if(arr[start] > arr[mid]  && arr[mid] < arr[mid-1])
			return mid;
		return (arr[start] > arr[mid]) ? getPivotElement(arr, start, mid) : getPivotElement(arr, mid+1, end);
			
	}
	
	

}
