package com.lti.day5;

public class CommonPrimeDivisors {
	
	public static int gcd(int a,int b){
        if (a % b == 0)
        return b;
        else
        return gcd(b, a % b);
   }
   
   public static int solution(int[] A, int[] B) {
       // write your code in Java SE 8
       int gcd=0;
       int count=0;
       for(int i=0;i<A.length;i++){
           int x=Math.max(A[i],B[i]);
           int y=Math.min(A[i],B[i]);
           
           gcd=gcd(x,y);
           System.out.println(gcd);
         //  int m=Math.max(x,y);
           int temp2=x/gcd;
           if(y%temp2==0){
               count++;
           }

        }
       return count;
   }
	public static void main(String[] args) {
		int[] A = {15,10,8};
		int[] B = {75,30,81};
		System.out.println(solution(A, B));
	}
}
