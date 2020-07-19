package com.codility.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenomicRange {
	
	public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
		int k=S.length();
        String[] count = new String[k+1];
        
        for(String i:count)
            System.out.println(i);
        
        for(int i=0;i<count.length;i++) {
        	count[i]="";
        }
        
        for(int i=1;i<count.length;i++) {
            count[i] = count[i-1]+S.charAt(i-1);
        }
        
        List<String> list = new ArrayList<String>();
        
        for(int i=0;i<P.length;i++) {
        	S.substring(P[i]+1, Q[i]);
        }
        
        
        
        for(String i:count)
            System.out.println(i);
        return P;
    }
	
	
	public static int[] efficientSolution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
		int k=S.length();
        int[] A = new int[k+1];
        int[] C = new int[k+1];
        int[] G = new int[k+1];
        int[] T = new int[k+1];
        
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(C));
//        System.out.println(Arrays.toString(G));
//        System.out.println(Arrays.toString(T));
        
        for(int i=0;i<S.length();i++) {
        	if(S.charAt(i) =='A') {
        		A[i+1] = A[i] +1;
        		C[i+1] = C[i];
        		G[i+1] = G[i];
        		T[i+1] = T[i];
        	}
        	else if(S.charAt(i) =='C') {
        		A[i+1] = A[i];
        		C[i+1] = C[i] +1;
        		G[i+1] = G[i];
        		T[i+1] = T[i];
        	}
        	else if(S.charAt(i) =='G') {
        		A[i+1] = A[i];
        		C[i+1] = C[i];
        		G[i+1] = G[i] +1;
        		T[i+1] = T[i];
        	}
        	else if(S.charAt(i) =='T') {
        		A[i+1] = A[i];
        		C[i+1] = C[i];
        		G[i+1] = G[i];
        		T[i+1] = T[i] +1;
        	}
        }
        
        System.out.println("A : "+Arrays.toString(A));
        System.out.println("C : "+Arrays.toString(C));
        System.out.println("G : "+Arrays.toString(G));
        System.out.println("T : "+Arrays.toString(T));
        
        int[] result = new int[P.length];
        for(int i=0;i<P.length;i++) {
        	int countA = A[Q[i]+1] - A[P[i]];
        	int countC = C[Q[i]+1] - C[P[i]];
        	int countG = G[Q[i]+1] - G[P[i]];
        	int countT = T[Q[i]+1] - T[P[i]];
        	
        	System.out.println("Count A : "+countA);
        	System.out.println("Count C : "+countC);
        	System.out.println("Count G : "+countG);
        	System.out.println("Count T : "+countT);
        	System.out.println("");
        	
        	if(countA>0)
        		result[i]=1;
        	else if(countC>0)
        		result[i]=2;
        	else if(countG>0)
        		result[i]=3;
        	else if(countT>0)
        		result[i]=4;
        		
        }
		
        
        System.out.println("result"+Arrays.toString(result));
        
        return result;
        
    }
	
	public static void main(String[] args) {
		String S="CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
//		solution(S, P, Q);
		efficientSolution(S, P, Q);
	}
}
