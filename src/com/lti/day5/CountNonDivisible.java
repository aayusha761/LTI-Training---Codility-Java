package com.lti.day5;

import java.util.Arrays;
import java.util.HashMap;

public class CountNonDivisible {
	public static int[] solution(int[] A) {
		
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int i:A) {
			if(count.get(i) !=null) count.put(i, count.get(i) +1);
			else count.put(i, 1);
		}
		System.out.println(count);
		
		int[] divisors = new int[count.size()];
		for(int i=0;i<divisors.length;i++) {
			if(count.get(i) != null) {
				for(int j=i;j<divisors.length;j+=i) {
					divisors[j] += count.get(A[i]);
				}
			}
		}
		
		System.out.println(Arrays.toString(divisors));
		return null;
	}
	
	public static int[] solution1(int[] A) {
		//Counting Elements Algo using HashMap
		int maxElem = 0;
		for(int elem : A)
			maxElem = Math.max(maxElem, elem);
		
		int count[] = new int[maxElem + 1];
		for(int i = 0; i < A.length; i++) {
			count[A[i]]++;
		}
		
		System.out.println(Arrays.toString(count));
		
		//The Great Eratosthenes Algo
		int[] divisors = new int[count.length];
		for(int i=0; i<divisors.length; i++) {
			if(count[i] > 0) {
				for(int j=i; j<divisors.length; j+=i) {
					divisors[j] += count[i];
				}

			}
				
		}
		
		System.out.println(Arrays.toString(divisors));
		
		int[] nonDivisors = new int[A.length];
		for(int i=0; i<nonDivisors.length; i++)
			nonDivisors[i] = nonDivisors.length - divisors[A[i]];
		
		System.out.println(Arrays.toString(nonDivisors));

		return nonDivisors;
	}
	public static void main(String[] args) {
		int[] A = {3,1,2,3,6};
//		solution(A);
		System.out.println(solution1(A));
	}
}
