package com.codility.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountDistinctSlices {
	public static int solution(int M, int[] A) {
        int count=0;
        for(int back=0;back<A.length;back++){
            HashSet<Integer> h = new HashSet<Integer>();
            int front =back;

            while(front<A.length && (!h.contains(A[front]))){
                h.add(A[front]);
               // System.out.println(back+" "+front);
                front++;
                count++;
                
            }
           // System.out.println(count);
            h.remove(A[back]);
        }
        return count ;
    }
	
	public static void main(String[] args) {
		int M = 6;
		int[] A = {3, 4, 5, 5, 2};
		int[] B = {1, 3, 4, 1, 2, 1, 3, 2, 1};
		System.out.println(solution(M, A));
//		System.out.println(solution(10000, B));
	}
}

