package com.oracle.abhijith.problemsolving;

import java.util.Arrays;
import java.util.Comparator;

public class GroupAnagramSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee" };
		for (String str : array) {
			System.out.println(str);
		}

		Arrays.sort(array, new AnagramComparator());
		System.out.println("After the Comparator Implementation.");

		for (String str : array) {
			System.out.println(str);
		}

	}

}

class AnagramComparator implements Comparator<String> {

	private static String anagrmCharSort(String str) {
		char[] charSet = str.toCharArray();
		Arrays.sort(charSet);
		return new String(charSet);
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return anagrmCharSort(o1).compareTo(anagrmCharSort(o2));
	}

}
