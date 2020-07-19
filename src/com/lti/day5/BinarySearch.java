package com.lti.day5;

public class BinarySearch {
	
	public static int solution(int[] A, int x) {
		
		int result = -1;
		int n = A.length;
		int beg = 0;
		int end = n - 1;
		while(beg<=end) {
			int mid = (beg+end)/2;
			if(A[mid] <=x) {
				beg = mid +1;
				result = mid;
			}
			else {
				end = mid - 1;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int[] A = {12, 15, 15, 19, 24, 31, 53, 59, 60};
		int x = 53;
		System.out.println(solution(A, x));
	}
}