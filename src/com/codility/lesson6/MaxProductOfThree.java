package com.codility.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
	public static int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        
        for(int i=0;i<A.length;i++) {
            if(A[i]<0) list1.add(A[i]);
            else list2.add(A[i]);
        }
        
        // for(int i:list2)
        //     System.out.println(i);
        
        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());
        // for(int i:list1)
        //     System.out.println(i);
        
        list1.addAll(list2);
        
        // for(int i:list1)
        //     System.out.println(i);
            
        int product = Integer.MIN_VALUE;
        int k=A.length;
        for(int i=0;i<k-2;i++) {
            if(i+2<k) {
                int temp = list1.get(i)*list1.get(i+1)*list1.get(i+2);
                if(temp>product) product=temp;
            }
        }
        System.out.println(product);
        return product;
    }
	
	public static void main(String[] args) {
		int[] A = {-3,-1,2,2,5,-6};
		//-6,-3,-1,2,2,5
		solution(A);
	}
}
