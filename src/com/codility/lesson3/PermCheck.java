package com.codility.lesson3;

import java.util.*;

public class PermCheck {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int size = A.length;
		List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<size;i++) {
            list.add(A[i]);
        }
        list.sort(null);
        
        for(int i = 0;i<size;i++){
            if(i+1 !=list.get(i))
                return 0;
        }
        return 1;
    }
	
	public static int solution1(int[] A) {
        // write your code in Java SE 8
		Arrays.sort(A);
        int size = A.length;
        
        for(int i = 0;i<size;i++){
            if(i+1 !=A[i])
                return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
		int[] A = {4,1,3};
//		System.out.println(solution(A));
		System.out.println(solution1(A));

	}
}
