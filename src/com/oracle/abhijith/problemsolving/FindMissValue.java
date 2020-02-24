package com.oracle.abhijith.problemsolving;

public class FindMissValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,3,4,5,6,7,9,10};
		System.out.println(findMissOne(arr1, 0, arr1.length-1));
	}
	
	public static int findMissOne(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			
			if((arr[mid+1] - arr[mid]) != 1)
					return arr[mid]+1;
			
			return ((arr[mid]-arr[start])== mid) ? findMissOne(arr, mid+1, end) :
				findMissOne(arr, start, mid);
		}else {
			return -1;
		}
		
		
	}

}
