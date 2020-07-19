package com.codility.lesson4;

public class CountingElements {
	
	private static void solution(int[] a, int m) {
		int[] count = new int[m+1];
		for(int i=0;i<count.length;i++) {
			System.out.println(i+" - "+count[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			count[a[i]] +=1;
		}
		for(int i=0;i<m;i++) {
			System.out.println(i+" - "+count[i]);
		}
	}
	public static void main(String[] args) {
		int[] A = {0,0,4,2,4,5}; 
		solution(A, 5);
	}
}
