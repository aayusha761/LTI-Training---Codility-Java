package com.codility.lesson6;
import java.util.*;
public class NumberOfIntersections {
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
        
    	final Comparator<List<Integer>> comparator = new Comparator<List<Integer>>() {
    	    public int compare(List<Integer> pList1, List<Integer> pList2) {
    	        return pList1.get(0).compareTo(pList2.get(0));
    	    }
    	};
    	
        int intersection = 0;
        
	    ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
        
        for(int i=0;i<A.length;i++) {
            // System.out.println(i);
            int start = i - A[i];
            int end = i + A[i];
    	    x.add(new ArrayList<Integer>(Arrays.asList(start, end)));
        }
        
	     
	    Collections.sort(x, comparator);
	    System.out.println(x.toString());

	    for(int i=0;i<x.size()-1;i++) {
	    	for(int j=i+1;j<x.size();j++) {
	    		if(x.get(i).get(1)>=x.get(j).get(0)) {
		    		intersection++;
		    	}
	    	}
	    	
	    }
	    
	    System.out.println(intersection);
	    
        return intersection;
    }
    
    public static int solution1(int[]A) {
    	
    	int k= A.length;
        long[] start = new long[A.length];
        long[] right = new long[A.length];
    	for(int i=0;i<A.length;i++) {
            // System.out.println(i);
            int start = i - A[i];
            int end = i + A[i];
    	    x.add(new ArrayList<Integer>(Arrays.asList(start, end)));
        }
    }
	public static void main(String[] args) {
		int[] A = {1,5,2,1,4,0};
		int[] B = {1,1,1};
		solution(A);
//		solution(B);
	}
}
