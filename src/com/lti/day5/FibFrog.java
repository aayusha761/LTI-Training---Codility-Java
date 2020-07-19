package com.lti.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibFrog {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8

		
		if(A.length == 0 || A.length == 1) {return 1;}
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
		System.out.println(fibs);
		
		int countZero = 0;
		int countOne = 0;
		
		for(int i=0;i<A.length;i++) {
			if(A[i] == 1) {countOne++;}
			else countZero++;
		}
		

		if(countZero == A.length) {
			if(fibs.contains(countZero +1)) {return 1;}
			else return -1;
		}
		if(countOne == A.length) {
			if(fibs.contains(countOne +1)) {return 1;}
			else return -1;
		}
		
		List<Integer> tweak = IntStream.of(A).boxed().collect(Collectors.toList());
		if(tweak.get(0) == 0) {
			tweak.add(0, 1);
		}
//		else {
//			tweak.add(0, 0);
//		}
//		tweak.remove(index)(0, 1); //one leaf in the beginning
		
		if(tweak.get(tweak.size() - 1) == 0) {
			tweak.add(tweak.size()-1, 1);
			tweak.remove(tweak.size()-1);

		}
		
		
		System.out.println(tweak.size());
//		tweak.add(1); //one leaf at the end
		
		System.out.println(Arrays.toString(A));
		A = tweak.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(A));
//		System.out.println(A.length);
		
		int lastIndex = 0;
		int count=0;
		
		for(int i=1;i<A.length;i++) {
			if(A[i] == 1) {
				int currentIndex = i;
				int jump = currentIndex - lastIndex;
				if(fibs.contains(jump)) {
                	count++;
                    lastIndex = i;
            	}
			}
		}
		System.out.println("count "+count);
		
		
		return count+1;
    }
	public static void main(String[] args) {
		int[] A = {0,0,0,1,1,0,1,0,0,0,0};
		
//		 System.out.println(solution(new int[] { 0, 0, 0, 0, 0, 0 }));
//		 System.out.println(solution(new int[] { 0, 0, 0, 0, 0, 0, 0}));
		 System.out.println(solution(new int[] { 0, 0, 0 }));
//		 System.out.println(solution(new int[] { 0, 0 }));
//		 System.out.println(solution(new int[] { 1, 1, 0, 0, 0 }));
//		 System.out.println(solution(new int[] { 1, 1, 1 }));
//		 System.out.println(solution(new int[] { 1, 1 }));
//		 System.out.println(solution(new int[] { 1 }));
//		 System.out.println(solution(new int[] { 0 }));
//		 System.out.println(solution(new int[] { }));
//		 System.out.println(solution(new int[] {0,0,0,0,1}));
		 
//		solution(A);
//		System.out.println(solution(A));
	}
}
