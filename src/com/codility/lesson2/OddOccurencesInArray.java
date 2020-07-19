package com.codility.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OddOccurencesInArray {
	public static int solution(int[] A) {
		List<Integer> list = new ArrayList<Integer>();
        Set<Integer> st = new HashSet<Integer>(list); 
		int size = A.length;
		
		for(int i =0;i<size;i++) {
			list.add(A[i]);
		}
		
        st.addAll(list);
		
		for(int i:st) {
			if(Collections.frequency(list, i)%2 !=0) return i;
		}
		
		return 0;
		
	}
	
	public static int solution2(int[] A) {
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            n ^= A[i];
        }
        return n;
    }
	
	public static int solution1(int[] A) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0;i<A.length;i++) {
//        	System.out.println(A[i]);
        	if(hash.containsKey(A[i])) {
//        		System.out.println("Contains");
        		hash.put(A[i], hash.get(A[i]) + 1);
        	}
        		
        	else {
//        		System.out.println("Not Contains");
//        		System.out.println(A[i]);
        		hash.put(A[i], 1);
        	}	
        }
        System.out.println(hash);
        for(Entry<Integer, Integer> m: hash.entrySet()) {
        	if(m.getValue()%2 != 0)
        		return m.getKey();
        }
        
		
		return 0;
		
	}

	
	public static void main(String[] args) {
		int[] arr = {9,3,9,3,9,7,9,6};
		solution1(arr);
		System.out.println(solution2(arr));
	}
}
