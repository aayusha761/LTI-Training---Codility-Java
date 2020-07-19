package com.codility.lesson5;

public class MinAvgTwoSlice {
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
        double[] count = new double[A.length+1];
        double[] avg = new double[A.length];
        
        
        for(int i=1;i<count.length;i++) {
            count[i] = (count[i-1] + A[i-1]);
        }

        for(int i=0;i<avg.length;i++) {
            avg[i] = count[i+1]/(i+1);
        }
        
        
        double min = avg[0];
        int index = 0;
        for(int i=0;i<avg.length;i++) {
            if(avg[i]<min){
                min = avg[i];
                index=i-1;
            }
        }
         System.out.println(min);
         System.out.println(index);
            
        
        return index;
    }
	
	public static int solution1(int[] A) {
		
		int size = A.length;
		
		double min = (A[0] + A[1])/2.0;		
		int index=0;
		for(int i=0;i<size-2;i++) {
			//pair of two
			double count1 = (A[i] + A[i+1])/2.0;
			double count2 = (A[i] + A[i+1] + A[i+2])/3.0;
			
			System.out.println("index : "+i+" "+(i+1)+" ---- "+count1);
			System.out.println("index : "+i+" "+(i+1)+" "+(i+2)+" ---- "+count2);
			
			if(count1<min) {
				min=count1;
				index=i;
			}
			
			//pair of three
			if(count2<min) {
				min=count2;
				index=i;
			}
			
			System.out.println("min : "+min);
			
		}
		
		//left pair
		double left = (A[size -1] + A[size-2])/2.0;
		
		System.out.println("index : "+(size-2)+" "+(size - 1)+" ---- "+left);
		
		if(left<min) {
			min=left;
			index=size-2;
		}
		System.out.println("min : "+min);
		System.out.println("index : "+index);
		return index;		
    }
	
	public static int efficientSolution(int[] A) {
        // write your code in Java SE 8
        double minAvg = (A[0] + A[1])/2.0;
        
        int index = 0;
        double avg = 0.0;
        for(int i=0; i<A.length-2; i++) {
            //checking avg of 2 elements
            avg = (A[i] + A[i+1])/2.0;
            if(avg < minAvg) {
                minAvg = avg;
                index = i;
            }
            //checking avg of 3 elements
            avg = (A[i] + A[i+1] + A[i+2])/3.0;
             if(avg < minAvg) {
                minAvg = avg;
                index = i;
            }
        }
        
        //checking for the last pair
        avg = (A[A.length - 2] + A[A.length - 1])/2.0;
        if(avg < minAvg) {
            minAvg = avg;
            index = A.length - 2;
        }
        
        System.out.println("min : "+minAvg);
        System.out.println("index : "+index);
        
        return index;
    }
	
	public static void main(String[] args) {
		int[] A= {4,2,1,5,1,5,8};
		
		int[] B = {-3, -5, -8, -4, -10};
		
//		solution(A);
//		solution(B);
//		solution1(A);
//		solution1(B);
//		System.out.println(efficientSolution(B));
		
	}
}
