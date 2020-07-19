package com.codility.lesson3;

import java.util.ArrayList;
import java.util.List;

public class TapeEquillibrium {
	
	public static int solutionF(int[] A) {		//Performance issue but logic correct
		int n = A.length;
		int sum1=0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n-1;i++) {
			sum1 = sum1 +A[i];
			int sum2=0;
			for(int j=i+1;j<n;j++) {
				sum2 = sum2 + A[j];
			}
			int diff = Math.abs((sum2-sum1));
			list.add(diff);
		}
		
		list.sort(null);

		return list.get(0);
    }
	public static int solution(int[] A) {
		int n = A.length;
		int sum = 0;
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
		}
//		System.out.println(sum);
		
		List<Integer> list = new ArrayList<Integer>();

		int sum1=0;
		
		for(int i=0;i<A.length;i++) {
			if(A[i]<0)	A[i]=Math.abs(A[i]);

			sum1 = sum1 + A[i];
			int diff = Math.abs(sum1-Math.abs(sum1 - sum));
//			System.out.println(diff);
			list.add(diff);
		}
		list.sort(null);
		
		return list.get(0);
		
	}
	
    public static int solution1(int[] A) {
		int n = A.length;
		
		int sum = 0;
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
		}
		
		int sum1=0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n-1;i++) {
			sum1 = sum1 +A[i];
			int sum2=0;
			int sum3 = sum - sum1;
			int sum4 = sum1 - sum3;
//			System.out.println(sum4);
//			for(int j=i+1;j<n;j++) {
//				sum2 = sum2 + A[j];
//			}
			int diff = Math.abs((sum4));
			System.out.println(diff);
			list.add(diff);
		}
		
		list.sort(null);

		return list.get(0);
    }
    
    public static int solution2(int[] a) {
        
        int sum=0,flag=0,min=0;
		sum=a[0];
		
		for(int j=1;j<a.length;j++) {
			flag+=a[j];
		}
		
		System.out.println("flag : "+flag);
		 
		min=sum;
		sum=Math.abs(sum-flag);
		for(int k=1;k<a.length - 1;k++) {
			min+=a[k];
			flag-=a[k];		
			sum=sum<Math.abs(min-flag)?sum:Math.abs(min-flag);
			
			System.out.println(sum);
	
	    }
	    
	    return sum;
    }
    
	public static void main(String[] args) {
		int A[] = {-3,-2,-1,1,2,3};
		System.out.println(solution2(A));
		
	}
}
