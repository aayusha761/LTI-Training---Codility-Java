package com.lti.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibFrogs1 {

		  
		public static int solution(int[] A) {
				  
				List<Integer> fibs = new ArrayList<>();
				fibs.add(1);
				fibs.add(2);
				for (int i = 2; i < A.length + 2; i++) {
					int no = fibs.get(i - 1) + fibs.get(i - 2);
					if (no < A.length + 2)
						fibs.add(no);
					else
						break;
				}
//				System.out.println(fibs);
				
				//Converting List<Integer> to int[]
				int[] fibo = fibs.stream().mapToInt(i -> i).toArray();
//				System.out.println(Arrays.toString(fibo));
				
				//Converting int[] to List<Integer>
				List<Integer> tweak = IntStream.of(A).boxed().collect(Collectors.toList());
				tweak.add(0, 1); //one leaf in the beginning
				tweak.add(1); //one leaf at the end
				
//				System.out.println(Arrays.toString(A));
				A = tweak.stream().mapToInt(i -> i).toArray();
//				System.out.println(Arrays.toString(A));
				
				int[] jumps = new int[A.length];
				
				for(int pos = 1; pos < A.length; pos ++) {
//					System.out.println("pos " + pos);
					int maxJump = A.length;
					for(int fib : fibo) {
						int step = pos - fib;
//						System.out.println("step " + step);
						if(step >= 0) {
//							System.out.println("before jumps[step] + 1; -->" + (jumps[step] + 1));
							if(A[step] == 1 && jumps[step] + 1 < maxJump)
								maxJump = jumps[step] + 1;
//							System.out.println("after jumps[step] + 1; -->" + (maxJump));
						}
						else
							break;
					}
					jumps[pos] = maxJump;
				}
//				System.out.println(Arrays.toString(jumps));
				
				return jumps[A.length - 1] != A.length ? jumps[A.length - 1] : -1;
	}
	
	public static void main(String[] args) {
		int[] A = {0,0,0,1,1,0,1,0,0,0};
		
//		 System.out.println(solution(new int[] { 0, 0, 0, 0, 0, 0 }));
//		 System.out.println(solution(new int[] { 0, 0, 0, 0, 0, 0, 0}));
//		 System.out.println(solution(new int[] { 0, 0, 0 }));
//		 System.out.println(solution(new int[] { 1, 1, 0, 0, 0 }));
//		 System.out.println(solution(new int[] { 1, 1, 1 }));
//		 System.out.println(solution(new int[] { 1, 1 }));
//		 System.out.println(solution(new int[] { 1 }));
//		 System.out.println(solution(new int[] { 0 }));
//		 System.out.println(solution(new int[] { }));
		 
//		solution(A);
		System.out.println(solution(A));
	}
}
