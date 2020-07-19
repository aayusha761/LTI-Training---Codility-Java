package com.lti.day5;

public class Pattern {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i>=j) {
					System.out.print('*');
				}
				
			}
			System.out.print('\n');
		}
	}
}
