package com.lti.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length ==0)	return 1;
		for(int i=0;i<A.length;i++) {
		    System.out.println(A[i]);
		}
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<A.length;i++) {
		    list.add(A[i]);
		}
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) != i+1) 
				return (list.get(i)-1);
			
		}

		return list.get(list.size()-1) +1;
    }
	public static void main(String[] args) {
		int A[] = {2,3,4,1};
		System.out.println(solution(A));
	}
}
