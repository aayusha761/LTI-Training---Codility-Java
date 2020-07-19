package com.lti.day5;

public class CaterpillarMethod {
	
	private static boolean solution(int[] a, int k) {
		// TODO Auto-generated method stub
		
		int front = 0,back=0;
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			while(front < a.length && a[front] + sum <= k) {
				sum+=a[front];
				front++;
				
			}
			if(sum == k) return true;
			sum = sum - a[i];
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] A = {3,1,5,2,3,1,2};
		System.out.println(solution(A, 10));
	}
}
