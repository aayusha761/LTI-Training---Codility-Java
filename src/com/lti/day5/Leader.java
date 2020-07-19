package com.lti.day5;

import java.util.Stack;

public class Leader {
	
	private static int solution(int[] A) {
		
		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> index = new Stack<Integer>();
		
		if(A.length == 0) return -1;
		if(A.length == 1) return 0;
		
		for(int i=0;i<A.length;i++) {
			if(!st.isEmpty()) {
				int x = A[i];
				int y = st.peek();
				if(x==y) {
					st.push(x);
					index.push(i);
				}
				else {
					st.pop();
					index.pop();
					continue;
				}
			}
			if(st.isEmpty()) {
				int x = A[i];
				st.push(x);
				index.push(i);
			}
		}
		
		if(st.isEmpty()) return -1;
		
		int leader = -1;
		int count = 0;
		for(int i:A) {
			if (i == st.peek()) {
				count += 1;
			}
		}
		if(count>A.length/2) {
			leader = st.peek();
		}
			
 		System.out.println("leader : "+leader);
 		System.out.println("index leader : "+index);
        if(leader>=0) return index.peek();
        else return leader;
		
	}
	
	public static void main(String[] args) {
		int[] A = {4,6,6,6,6,8,8};
		int[] B = {6,8,4,6,8,6,6};
		int[] C = {3,4,3,2,3,-1,3,3};
		int[] D = {2, 1, 1, 3};
		int[] E = {1,2,3,4,5};
//		solution(A);
//		solution(B);
//		solution(C);
		System.out.println(solution(E));
	}

	
}
