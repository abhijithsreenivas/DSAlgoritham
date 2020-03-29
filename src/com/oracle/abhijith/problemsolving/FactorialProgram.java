package com.oracle.abhijith.problemsolving;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println("Factorial  of " + x + ":-   " + getFactorial(x));
	}

	private static int getFactorial(int num) {

		return (num == 1) ? num : num * getFactorial(num - 1);

	}

}

// OUTPUT Factorial  of 7:-   5040 //

// This is straight recursion and runtime is O(n) //
