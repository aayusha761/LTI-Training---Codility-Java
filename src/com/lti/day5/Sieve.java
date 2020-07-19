package com.lti.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sieve {
	public static boolean[] sieve(int n) {
		
		boolean[] sieve = new boolean[n+1];
		Arrays.fill(sieve, true);
		sieve[0] = sieve[1] = false;
		
		for(int i = 2; i*i <=n; i++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(sieve[i]) { 
                // Update all multiples of p 
                for(int k = i*2; k <= n; k += i) 
                    sieve[k] = false; 
            } 
        } 
		System.out.println(Arrays.toString(sieve));
		return sieve;
	}
	
	public static void arrayF(int n) {
		int[] F = new int[n+1];
//		int i=2;
		for(int i=2;i*i<=n;i++) {
			if(F[i] == 0) {
				for(int k=i*2;k<=n;k+=i) {
					if(F[k] == 0) F[k] = i;
				}
			}
		}
		
		System.out.println(Arrays.toString(F));
	}
	
	public static int primeFactors(int n) 
    {
		long copy = n, i;
	    List<Long> primeFactor = new ArrayList<>();
        for (i = 2; i <= copy; i++) 
        {
            if (copy % i == 0) 
            {
                primeFactor.add(i);
                copy /= i;
                i--;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
//		sieve(17);
//		arrayF(20);
		primeFactors(10);
	}
}