package com.codility.lesson2;

public class Rotation {
	
	public static int[] solution1(int[] A, int K) {
        int n = A.length;
		int count = 0;
		
		while(count<K) {
			int end = A[n-1];
			for(int i=n-1;i>0;i--) { 
				A[i] = A[i-1];
			}
			A[0] = end;
			count++;
		}
		
		for(int i=0;i<n;i++) {
		System.out.println(A[i]);
		}
		
		return A;
    }
	
	public static int[] solution(int[] A, int K) {
		int n = A.length;		//n=4
		int count = 0;
		if(A.length == 0) return A;
		
		for(int i=1;i<n-1;i++) {
			int t = A[i];
			A[i] = A[i-1];
		}
		
//		for(int i=0;i<n;i++) {
//			System.out.println(A[i]);
//		}
		
		
		return A;
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
//		solution1(a, 4);
		int[] A = {3, 8, 9, 7, 6};
		int K = 5;
		solution1(A, K);
		
		//6,3,8,9,7
		//7,6,3,8,9
		//9,7,6,3,8
	}
}
