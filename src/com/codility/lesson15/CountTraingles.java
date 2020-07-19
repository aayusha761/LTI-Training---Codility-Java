package com.codility.lesson15;

import java.util.Arrays;

public class CountTraingles {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
        int n = A.length;
        int result = 0;
        Arrays.sort(A);
        for(int x=0;x<A.length;x++) {
            int z = x+2;
            for(int y=x+1;y<A.length;y++) {
                while(z < A.length && A[x] + A[y] >A[z]) {
                	z++;
                }
                result+=z-y-1;
                
            }
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		int[] A = {10,2,5,1,8,12};
		System.out.println(solution(A));
	}
}
