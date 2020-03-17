package com.oracle.abhijith.problemsolving;

public class SparseSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String[] sparseArr = {"apple","","","bar","","","","","cat","","sachin","","","zeebra"};
	 System.out.println(sparseSearch(sparseArr, "zeebra", 0, sparseArr.length-1));
	}
	
	private static int getLastValidIndex(String[] arr, int start, int last) {
		int mid = (start+last)/2;
		int left = mid-1;
		int right = mid+1;
		while(true) {
			if(left < start && right > last) {
				return -1;
			}
			if(left>=start && !arr[left].isEmpty()) {
				mid = left;
				break;
			}
			
			if(right<= last && !arr[right].isEmpty()) {
				mid = right;
				break;
			}
			left--;
			right++;
		}
		return mid;
	}

	public static int sparseSearch(String[] arr,String key, int start, int last) {
		int index = getLastValidIndex(arr, start, last);
		if(index == -1)
				return index;
		if(key.equalsIgnoreCase(arr[index]))
				return index;
		return (key.compareTo(arr[index]) < 0) ? sparseSearch(arr, key, start, index):
				sparseSearch(arr, key, index+1, last);
				
	}
}
