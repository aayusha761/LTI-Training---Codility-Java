package com.lti.day5;

public class SwapElements {
	
	private static void solution(int[] a, int[] b) {
		int sumA=0;
		int sumB=0;
		for(int i=0;i<a.length;i++) {
			sumA += a[i];
		}
		for(int i=0;i<b.length;i++) {
			sumB += b[i];
		}
//		System.out.println(sumA+" "+sumB);
		
		for(int i=0;i<a.length;i++) {
//			System.out.println("i : "+i);
			int temp1=sumA;		//11
			int temp2=sumB;		//15
			
			temp1 = sumA - a[i];		//11-4=7
			for(int j=0;j<b.length;j++) {
//				System.out.println("j : "+j);		//0
				temp1 = temp1+b[j];		//7+3=10
				temp2 = sumB - b[j];	//15-3=12
				temp2 = temp2 + a[i];	//12+4=16
				
//				System.out.println("temp1 : "+temp1);
//				System.out.println("temp2 : "+temp2);
//				System.out.println();
				
				if(temp1 == temp2) {
					System.out.println(a[i]);
					System.out.println(b[j]);
				}
				
			}
		}
		
	}
	
	private static void solution1(int[] a, int[] b) {

		int sumA=0;
		int sumB=0;
		for(int i=0;i<a.length;i++) {
			sumA += a[i];
		}
		for(int i=0;i<b.length;i++) {
			sumB += b[i];
		}
//		System.out.println(sumA+" "+sumB);
		
		for(int i=0;i<a.length;i++) {
//			System.out.println("i : "+i);
//			int temp1=sumA;		//11
//			int temp2=sumB;		//15
			
//			temp1 = sumA - a[i];		//11-4=7
			for(int j=0;j<b.length;j++) {
//				System.out.println("j : "+j);
				int temp1 = sumA-a[i]+b[j];
				int temp2 = sumB-b[j]+a[i];
				
//				System.out.println("temp1 : "+temp1);
//				System.out.println("temp2 : "+temp2);
//				System.out.println();
				
				if(temp1 == temp2) {
					System.out.println(a[i]+" "+b[j]);
//					System.out.println(b[j]);
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] A = {4, 1, 2, 1, 1, 2};
		int[] B = {3, 6, 3, 3};
		
		int[] C = {5, 7, 4, 6};
		int[] D = {1, 2, 3, 8};
		
//		solution(A,B);
		solution(C,D);
		

//		solution1(A,B);
		solution1(C,D);
	}
}
