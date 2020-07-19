package com.codility.lesson4;

import java.util.ArrayList;
import java.util.List;

public class MissingInteger {
	public static int solution(int[] A) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
			list.add(A[i]);
		}
		
		
		list.sort(null);
		
//		System.out.println("----Before List----");
//		for(int i:list) {
//			System.out.println(i);
//		}
		
		int k = list.get(A.length-1);
		if(k<0) return 1;
		
//		System.out.println("k : "+k);
		
		int[] count = new int[k+1];
		for(int i=0;i<A.length;i++) {
//			System.out.println(A[i]);
			if(A[i]<0)	continue;
			count[A[i]] +=1;
		}
		
//		for(int i = 0;i<count.length;i++) {
//			System.out.println("i : "+i+" "+count[i]);
//		}
		
		for(int i=1;i<k;i++) {
//			System.out.println(count[i]);
			if(count[i] == 0) {
				return i;
			}
		}
		
		
		return k+1;
		
	}
	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		int[] B = {1,2,3};
		int[] C = {-1, -3};
		int[] D = {1,3};
		int[] E = {2,3};
		int[] F = {-1000000, 1000000};
//		System.out.println(solution(A));
//		System.out.println(solution(B));
//		System.out.println(solution(C));
//		System.out.println(solution(D));
//		System.out.println(solution(E));
		System.out.println(solution(F));
	}
}
