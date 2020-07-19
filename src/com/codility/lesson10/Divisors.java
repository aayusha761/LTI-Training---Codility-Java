package com.codility.lesson10;

public class Divisors {
	private static void solution(int n) {
		int divisors = 0;
		for(int i = 1;i<=Math.sqrt(n);i++) {
			if(i == Math.sqrt(n)) divisors +=1;
			else if(n%i == 0) divisors +=2;
			
		}
		System.out.println(divisors);
		
	}
	
    public static int solution1(int N) {
        // write your code in Java SE 8
	    int count1=1;
	    int count2=1;
	
	    for(int i=2;i<=Math.sqrt(N);i++)
	    {
	    	count1=1;
	    	while(N%i==0)		//36/2==0
	    	{  
	    		N=N/i;	//18,
	    		count1++;
    		}
	    	count2=count2*count1;
	    	System.out.println("count1 : "+count1);
	    	System.out.println("count2 : "+count2);
    	}
	    if(N!=1)
	    count2=count2*2;
	    return count2;
        
    }
    
    
	public static void main(String[] args) {
		int n = 36;
//		solution(n);
		power(n);
//		System.out.println(solution1(n));
	}

	private static void power(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i<Math.sqrt(n);i++) {
			int prime = 2;
			if(n%i ==0 && prime(i)) {
				System.out.println(i); 
			}
			
		}
		
	}
	
	private static boolean prime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
