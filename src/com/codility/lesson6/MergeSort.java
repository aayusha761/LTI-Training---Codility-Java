package com.codility.lesson6;

public class MergeSort {
	
	private static void solution(int[] a) {
		int k = a.length;
		int p = (a.length%2==0)?k/2:(k+1)/2;
		System.out.println(p);
		
		int[] newArray = new int[k];
		
	}
	
	public static void main(String[] args) {
		int[] A = {2,5,7,9,6,4,3,5,9};
		solution(A);
	}
}
