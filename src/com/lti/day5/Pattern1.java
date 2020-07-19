package com.lti.day5;
/*
 * 		* * * * * * *
 * 		  * * * * *
 * 		    * * *
 * 		   	  *
 * */


public class Pattern1 {
	
	public static void displayPattern() {
		
		int row = 4;
		int col = 2*row - 1;
		
		for(int i=0;i<col;i++) {
			System.out.print('*');
		}
		
	}
	public static void main(String[] args) {
//		for(int i=0;i<=6;i++) {
//			for(int j=0;j<=3;j++) {
//				if(i>=j) {
//					System.out.print("*");
//				}
//				
//			}
//			System.out.print('\n');
//		}
//		for(int i=0;i<=6;i++) {
//			for(int j=0;j<=3;j++) {
//				if(j>=i) {
//					System.out.print('*');
//				}
//				
//			}
//			System.out.print('\n');
//		}
		//7
//		for(int i = 0;i<=3;i++) {
//			for(int j=7;j>=4;j--) {
//				if(i!=j) {
//					System.out.print('*');
//				}
//			}
//			System.out.print('\n');
//		}
		
		displayPattern();
	}
}
