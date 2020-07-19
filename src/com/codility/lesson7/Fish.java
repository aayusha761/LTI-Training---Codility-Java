package com.codility.lesson7;

import java.util.Stack;

public class Fish {
    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        if(A.length == 1) return A[0];
        Stack<Integer> st = new Stack<Integer>();
        
        int count = 0;
        for(int i = 0;i<A.length;i++) {
            if(B[i] == 1) {
//            	count++;
                st.push(A[i]);
                System.out.println("stack : "+st+" at : " +i);

            }
            else {

                while(!st.isEmpty() && st.peek() > A[i]) {
                    // count++;
                    System.out.println("stack : "+st+" at : " +i);

                    st.pop();
                     break;
                }
                if(st.isEmpty() || st.peek() < A[i]) {
                    count++;
                    st.push(A[i]);
                    System.out.println("stack : "+st+" at : " +i);

                }

            }
        }
        System.out.println("length : "+A.length);
        System.out.println("count : "+count);
        return (A.length-count);
    }
    
    public static int solution1(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<Integer>();
        int c=0;
        for(int i=0;i<A.length;i++){
            if(B[i]==1)
                stack.push(A[i]);
            else{
                if(stack.empty())
                    c++;
                else{
                	System.out.println("A[i] : "+A[i]);
                	System.out.println("stack peek : "+stack.peek());
                    if(A[i]<stack.peek())
                        continue;
                    else{
                    	System.out.println(i);
                        stack.pop();
//                        i--;
                        c++;
                        System.out.println(i);
                    }
                }
            }
        }
        return (c+stack.size());
        
    }
    
    public static void main(String[] args) {
    	int[] A = {0,1};
    	int[] B = {1,1};
    	
    	int[] C = {4,3,2,1};
    	int[] D = {0,1,0,0};
//		solution(A, B);
//		solution(C, D);
		System.out.println(solution(A, B));
	}
}
