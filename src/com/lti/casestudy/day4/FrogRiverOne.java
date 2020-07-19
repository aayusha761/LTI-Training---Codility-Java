package com.lti.casestudy.day4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
	
	private static int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<A.length;i++) {
        	set.add(A[i]);
        	if(set.size() == X) {
        		return i;
        	}
        }
        return -1;
        
	}
	
	private static int solution1(int X, int[] A) {
		
		boolean[] count = new boolean[X+1];

		int remainingLeaf = X;
        for(int i=0;i<A.length;i++) {
        	if(!count[A[i]]) {
            	count[A[i]] = true;
        		remainingLeaf = remainingLeaf-1;
        	}
        	if(remainingLeaf == 0)
        		return i;
        	
        }
        return -1;
        
	}
	
	public static void main(String[] args) {
//		int X = 5;
		int[] A = {1,3,1,4,2,3,5,4};
		int[] B = {-1};
		int[] C = {3};
		System.out.println(solution(1, B));
		System.out.println(solution1(5, A));
	}
}
