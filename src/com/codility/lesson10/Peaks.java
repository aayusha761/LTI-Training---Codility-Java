package com.codility.lesson10;

import java.util.HashMap;

public class Peaks {
	
	public int solution1(int[] A) {
		HashMap<Integer, Integer> peaks = new HashMap<Integer, Integer>();
		for(int i=1; i<A.length-1; i++)
			if(A[i-1] < A[i] && A[i] > A[i+1])
				peaks.put(i, A[i]);
		
		int blocks = 0;
	
		for(int i=1; i<=A.length/2; i++) {
			if(A.length % i == 0) {			
				int noOfElems = A.length / i;
				//System.out.println("noOfElems " + noOfElems);
				int noOfBlocks = A.length / noOfElems;
				//System.out.println("noOfBlocks " + noOfBlocks);
	
				int blockStart = -1, blockEnd = -1;
				int peak = 0;
				
				for(int j=1; j<=noOfBlocks; j++) {
					blockStart = blockEnd + 1;
					blockEnd = j * noOfElems - 1;
					
					System.out.println("blockStart " + blockStart);
					System.out.println("blockEnd " + blockEnd);
					System.out.println();
//					System.out.println("count : "+peak);
					for(int position=blockStart; position<=blockEnd;position++) {
						if(peaks.containsKey(position)) {
							peak = peak+1;
							System.out.println("count : "+peak);
							break;
						}
					}
					if(peak == noOfBlocks) blocks=noOfBlocks;
				}
			}
		}
		
		return blocks;
	}
	public int solution(int[] A) {
		HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=1;i<A.length-1;i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) {hm.put(i, A[i]);}
        }

        int sol = 0;
        for(int i=1;i<=A.length/2;i++) {
            if(A.length%i == 0) {
                int noOfelements = A.length/i;
                int blocks = i;
                
                int start=-1, end = -1;
                int count=0;

                for(int j=1;j<=blocks;j++) {

                    start = end +1;     
                    end = j*noOfelements - 1;

                    
//                    System.out.println("start : "+start);
//                    System.out.println("end : "+end);
//                    System.out.println();

                    for(int k=start;k<=end;k++) {
                        
                        if(hm.containsKey(k)) {
                            count++;
                            break;
                        }
//                        System.out.println(count);

                    }
                    if(count==blocks) sol=count;


                }

            }
        }
        return sol;
	}
	
	public static int solution3(int[] A) {
		return 0;
	}

	public static void main(String[] args) {
		int[] A = new int[2000];
		A[0] = 1;
		A[1] = 2;
		A[2] = 1;
		
//		System.out.println(new Peaks().solution(A));
		System.out.println(new Peaks().solution1(new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2,5,7,9}));
	}
}
