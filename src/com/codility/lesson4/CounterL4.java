package com.codility.lesson4;
import java.util.*;
public class CounterL4 {
	
	public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] count = new int[N];

        System.out.println(Arrays.toString(count));

        
        int max=count[0];
        
        for(int i=0;i<A.length;i++) {
        	
        	if(A[i]<=N) {
                count[A[i]-1] +=1;
                max = Math.max(max, count[A[i] - 1]);

        	}
        	else {
                Arrays.fill(count, max);		//performance issue low due to this
        	}
            System.out.println(Arrays.toString(count));
        }
        
        System.out.println(Arrays.toString(count));
        
        return count;
    }
	
	public static int[] solution1(int N, int[] A) {

        int[] count = new int[N];
        int max=count[0];
        int maxAt = 0;
        int lastMax = 0;
        
        System.out.println(Arrays.toString(count));

        for(int i=0;i<A.length;i++) {
        	if(A[i]<=N) {
                count[A[i]-1] +=1;
                if(count[A[i] - 1]>max) max=count[A[i] - 1];

        	}
//        	else if(count[A[i] -1] < lastMax) {
//        		System.out.println("Here : "+count[A[i] -1]);
//        	}
        	else {
        		maxAt = i-1;
        		lastMax=max;
        		count[maxAt] = lastMax;
        	}
            System.out.println(Arrays.toString(count));
        }
        
//        System.out.println(Arrays.toString(count));
        System.out.println("MaxAt : "+maxAt);
        System.out.println("Max : "+max);
        System.out.println("LastMax : "+lastMax);
//        count[maxAt] = lastMax;
//        System.out.println("i : "+count[maxAt]);
        
        for(int i=0; i<count.length; i++)
			if(count[i] < lastMax)
				count[i] += lastMax;
        
//        System.out.println("MaxAt : "+maxAt);
//        System.out.println("Max : "+max);
//        System.out.println("LastMax : "+lastMax);


        System.out.println(Arrays.toString(count));
        
        return count;
    }
	
	public static int[] efficientSolution(int N, int[] A) {
		int[] countArr = new int[N];
		int maxCounter = 0;
		int lastCounter = 0;
		
		for(int i=0; i<A.length; i++) {
			int pos = A[i];
			if(pos > N) { //max counter instruction
				lastCounter = maxCounter;
			}
			else if(countArr[pos - 1] < lastCounter) {
				System.out.println("pos : "+pos);
				System.out.println("a : "+countArr[pos - 1]);
				System.out.println("b : "+lastCounter);
				countArr[pos - 1] = lastCounter + 1;
				maxCounter = Math.max(maxCounter, countArr[pos - 1]);
			}
			else {
				countArr[pos - 1] ++;
				maxCounter = Math.max(maxCounter, countArr[pos - 1]);
			}

		}
		
        System.out.println(Arrays.toString(countArr));
		
		//shifting all those still behind the checkpoint
		for(int i=0; i<countArr.length; i++)
			if(countArr[i] < lastCounter)
				countArr[i] = lastCounter;
		
        System.out.println(Arrays.toString(countArr));
		
		return countArr;
	}
	
	public static void main(String[] args) {
		int[] A = {3, 4, 4, 6, 1, 4, 4,6};
		int[] B = {1};
//		solution(5, A);
		
//		solution1(5, A);
//		efficientSolution(5, A);
//		solution1(1, B);

	}
}
