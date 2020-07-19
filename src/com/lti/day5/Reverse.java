package com.lti.day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
		Integer[] arr = {5,4,3,2,1};
//		int[] arr1 =  new arr[arr.length];
		int N = arr.length;
		//Before reversing
		for(int i:arr) {
			System.out.println(i);
		}
		
		//Logic
		
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		System.out.println(list);
		
		
		//After reversing
//		for(int[] i:list) {
//			System.out.println(i);
//		}
	}
}
