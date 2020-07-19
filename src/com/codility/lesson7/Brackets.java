package com.codility.lesson7;

import java.util.Stack;

public class Brackets {
	public static int solution(String S) {
        // write your code in Java SE 8
        if(S.length() == 0) return 1;
        Stack<Character> st = new Stack<>();
        if(S.length()%2 != 0) return 0;
        for(int i=0;i<S.length();i++) {
            if(S.charAt(i) =='{' || S.charAt(i) == '(' || S.charAt(i) == '[') {
                st.push(S.charAt(i));
            }
            else if(st.isEmpty()) {
            	return 0;
            }
            else if(S.charAt(i) == '}' && st.peek() =='{') {
                st.pop();
            }
            else if(S.charAt(i) == ')' && st.peek() =='(') {
                st.pop();
            }
            else if(S.charAt(i) == ']' && st.peek() =='[') {
                st.pop();
            }
        }
        if(st.size() == 0) return 1;
        else return 0;
    }
	
	public static void main(String[] args) {
		String S = "()";
		System.out.println(solution(S));
	}
}
