package com.lti.day5;

import java.util.ArrayList;
import java.util.List;

public class CoinChanging {
	
	private static List<Integer> solution(int[] m, int k) {
		// TODO Auto-generated method stub
		int n= m.length;
		List<Integer> list = new ArrayList<>();
		
		for(int i=n-1;i>-1;i--) {
			list.add(m[i], k/m[i]);
			k %= m[i];
		}
		
		return list;
	}
	public static void main(String[] args) {
		int[] M = {1,2,3};
		int k = 5;
		System.out.println(solution(M, k));
	}
}
