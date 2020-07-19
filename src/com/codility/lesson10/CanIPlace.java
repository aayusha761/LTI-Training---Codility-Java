package com.codility.lesson10;

import java.util.Arrays;

public class CanIPlace {
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] peaks = new boolean[A.length];
        // System.out.println(Arrays.toString(peaks));
        int maxFlags=0;

        for(int i = 1;i<A.length-1;i++) {
            if( (A[i] > A[i-1]) && (A[i] > A[i+1])) { peaks[i] = true; maxFlags++;}
        }
        
        // System.out.println(Arrays.toString(peaks));
        // System.out.println(maxFlags);
        
        for(int i=maxFlags;i>0;i--) {
        	if(canIPlaceFlags(i, peaks)) {
        		return i;
        	}
        }
        
        return 0;
    }
	
	private static boolean canIPlaceFlags(int flag, boolean[] peaks) {
		System.out.println(Arrays.toString(peaks));
        int count=0;
        for(int i=0;i<peaks.length;i++) {
            // System.out.println(i);
            if(peaks[i] && count < flag) {
                
                i=i+flag-1;
                count++;
                
            }
            else continue;
        }
        System.out.println(count);
        return (count==flag);
		
	}
	
	public static void main(String[] args) {
		int[] A = {7, 10, 4, 5, 7, 4, 6, 1, 4, 3, 3, 7};
		int[] B = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		int[] C = {1,2,1};
		solution(A);
		solution(B);
		solution(C);
	}
}
