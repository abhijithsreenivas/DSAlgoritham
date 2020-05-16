package com.oracle.abhijith.problems.chapter1;

public class StringUnique {
	
	public static boolean isUnique(String str){
		if(str.length()>128)
			return false;
		boolean[] charArr = new boolean[128];
		for (int i=0;i<str.length();i++) {
			int newChar = str.charAt(i);
			if(charArr[newChar]){
				return false;
			}else {
				charArr[newChar] = true;
			}
		}
		return true;
	}

	public static void main(String[] arg) {
		System.out.println(isUnique("Abhijith"));
	}
}
