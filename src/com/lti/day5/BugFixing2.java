package com.lti.day5;

import java.util.Arrays;

//return the minimal value that occurs in both the arrays
//if no match found return -1
public class BugFixing2 {

	public int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; ) {
            if (A[k] == B[i])
                return A[k];
            if (i < m-1  && B[i] < A[k])
                i += 1;
	        else
	        	k+=1;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int[] A = {0,5,7,8,0};
		int[] B = {4,2,5,3,2};
		System.out.println(new BugFixing2().solution(A, B));
	}
	
}

