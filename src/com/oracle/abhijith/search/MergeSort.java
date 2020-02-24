package com.oracle.abhijith.search;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4, 2, 6, 8, 9, 22, 0, 1 };
		mergeSort(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	public static void mergeSort(int[] arr) {
		int[] tempArr = new int[arr.length];
		mergeSort(arr, tempArr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int[] tempArr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, tempArr, start, mid);
			mergeSort(arr, tempArr, mid + 1, end);
			merge(arr, tempArr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int[] tempArr, int start, int mid, int end) {
		for (int i = 0; i <= end; i++) {
			tempArr[i] = arr[i];
		}

		int tempLeft = start;
		int tempRight = mid + 1;
		int current = start;

		while (tempLeft <= mid && tempRight <= end) {

			if (tempArr[tempLeft] < tempArr[tempRight]) {
				arr[current] = tempArr[tempLeft];
				tempLeft++;
			} else {
				arr[current] = tempArr[tempRight];
				tempRight++;
			}

			current++;

		}

		int remaining = mid - tempLeft;

		for (int i = 0; i <= remaining; i++) {
			arr[current + i] = tempArr[tempLeft + i];
		}

	}

}
