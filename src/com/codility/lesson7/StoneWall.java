package com.codility.lesson7;

import java.util.Stack;

public class StoneWall {
    public static int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> s = new Stack<Integer>();
        // s.push(H[0]);
        int count=0;
        for(int i=0;i<H.length;i++) {
            while(!s.isEmpty() && s.peek() > H[i]) {
                s.pop();
            }
            if(s.isEmpty() || s.peek() < H[i]) {
                count++;
                s.push(H[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
    	int[] H = {6,5,4,4,6,7,4,3};
		System.out.println(solution(H));
		
		String str = "abcdef";
		
	}
}
