package com.oracle.abhijith.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

public class GroupAnagramOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = { "apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee" };
		groupAnagram(array);
		for (String str : array) {
			System.out.println(str);
		}

	}

	private static void groupAnagram(String[] arr) {
		LinkedHashMap<String, ArrayList<String>> strGroup = new LinkedHashMap<String, ArrayList<String>>();

		for (String str : arr) {
			String convertedStr = getSortedCharKey(str);
			if (strGroup.containsKey(convertedStr)) {
				ArrayList<String> currentList = strGroup.get(convertedStr);
				currentList.add(str);
			} else {
				ArrayList<String> newArr = new ArrayList<String>();
				newArr.add(str);
				strGroup.put(convertedStr, newArr);
			}
		}

		Collection<ArrayList<String>> out = strGroup.values();
		ArrayList<String> output = new ArrayList<String>();
		for (ArrayList<String> eachArr : out) {
			output.addAll(eachArr);
		}
		output.toArray(arr);

	}

	private static String getSortedCharKey(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);

	}

}

/*
 * OUTPUT apple papel banana carrot tarroc ele eel lee duck cudk
 */