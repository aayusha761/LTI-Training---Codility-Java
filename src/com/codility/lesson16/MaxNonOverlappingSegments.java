package com.codility.lesson16;

public class MaxNonOverlappingSegments {
	public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int count = 0;
        for(int i=0;i<A.length-1;i++) {
            for(int j=i+1;j<A.length;j++) {
                if(B[i] < A[j]) {count++;}
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int[] A = {1, 3, 7, 9, 9};
		int[] B = {5, 6, 8, 9, 10};
		solution(A, B);
	}
}
