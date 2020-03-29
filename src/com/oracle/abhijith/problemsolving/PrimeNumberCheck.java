package com.oracle.abhijith.problemsolving;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primen Number Check..."+isPrime(5));
		
	}
	
	private static boolean isPrime(int number) {
		if(number==0 || number==1)
			return false;
		for(int i=2; i*i <= number;i++) {
			if(number%i==0)
				return false;
		}
		
		return true;
		
		
	}

}
/* Primen Number Check...false
 * 
 * Runtime O(rootN) 
 *  
 */