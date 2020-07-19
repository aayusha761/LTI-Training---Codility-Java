package com.lti.day5;

public class Kadane {
	
	private static void solution(int[] a) {
		int localMax = 0;
		int globalMax = 0;
		
		int start_index = 0;
		int end_index = 0;
		for(int i=0;i<a.length;i++) {
			localMax = Math.max(a[i], (localMax + a[i]));
			
			if(globalMax > localMax) {
				globalMax = localMax;
				start_index = i;
			}
			else {
				end_index = i;
			}

		}
		start_index = start_index+1;
		end_index = end_index - 1;
//		System.out.println(start_index+1);
//		System.out.println(end_index - 1);

		System.out.println("localmax : "+localMax);
		System.out.println("globalmax : "+globalMax);
	}
	public static void main(String[] args) {
		int[] A = {5,-4,8,-10,-2,4,-3,2,7,-8};
		int[] B = {-10};
		solution(B);
	}
}
