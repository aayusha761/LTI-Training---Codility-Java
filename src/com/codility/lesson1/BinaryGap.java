package com.codility.lesson1;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	
	public static int solution1(int N) {
		if(N==0) return 0;
		List<Integer> list = new ArrayList<Integer>();
		
		
		String binary = Integer.toBinaryString(N);
		System.out.println("Binary Form : " + binary);
		
		binary=binary.replace('0', ' ');
		binary = binary.trim();
		binary=binary.replace(' ', '0');
		System.out.println("After : "+binary);
		
		String splitVal[] = binary.split("1");
		
		for(int i=0;i<splitVal.length;i++) {
			String temp = splitVal[i];
			if(!temp.equals("")) {
				int size = splitVal[i].length();
				list.add(size);
			}
		}
		
		list.sort(null);
		if(list.size() !=0) {
			return list.get(list.size() -1);
		}
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(solution1(1041));
	}
}
