package com.lti.challenge;

import java.util.Stack;

public class SkyLine {
	public static void main(String[] args) {
		int[] A = {1,3,2,1,2,1,5,3,3,4,2};
		int[] B = {5,8};
		int[] C = {1,1,1,1};
		int[] D = {8, 8, 5, 7, 9, 8, 7, 4, 8};
		int[] E = {5,7,1,6,9,3,4,3};
		System.out.println(solution(A));
		System.out.println(solution(B));
		System.out.println(solution(C));
		System.out.println(solution(D));
		System.out.println(solution(E));
	}
	public static int solution(int[] A) {
		Stack<Integer> heights = new Stack<Integer>();
		int strokes = A[0];
		heights.push(A[0]);
		for(int i=1; i<A.length; i++) {
			if(heights.peek()==A[i]) {
				heights.push(A[i]);
			}
			else if(A[i]>heights.peek()) {
				strokes += A[i]-heights.peek();
				heights.push(A[i]);
			}
			else {
				while(!heights.isEmpty() && A[i]<heights.peek()) {
					heights.pop();
				}
				if(!heights.isEmpty() && A[i]==heights.peek()) {
					heights.push(A[i]);
				}
				else {
					heights.push(A[i]);
					strokes += A[i]-heights.peek();
				}
			}
		}
		return strokes;
	}
}
