package com.codility.lesson10;

import java.util.Arrays;

public class Flags {

	public int solution(int[] A) {
		if(A.length < 3)
			return 0;
		
		int[] peaks = new int[A.length];
		int currentPeak = A.length;
		peaks[A.length - 1] = currentPeak;
		for(int i=A.length-2; i>0; i--) {
			if(A[i-1] < A[i] && A[i] > A[i+1])
				currentPeak = i;
			peaks[i] = currentPeak;
		}
		peaks[0] = peaks[1];
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(peaks));
		
		//_/\_/\_/\_/\_/\_/\_/\_/\_/\_/\_/\_/\
		int noOfFlagsPossible = (int) (Math.sqrt(A.length) + 1);
		int noOfFlagsPlaced = 0;
		
		for(int noOfFlags = 1; noOfFlagsPlaced <= noOfFlagsPossible; noOfFlags ++) {
			if(canWePlaceFlags(peaks, noOfFlags))
				noOfFlagsPlaced ++;
			else
				break;
		}
		
		return noOfFlagsPlaced;
	}
	
	private boolean canWePlaceFlags(int[] peaks, int flagsToPlace) {
		int currentPosition = 1 - flagsToPlace;
		int distanceBetweenThePeaks = flagsToPlace;
		for(int i=0; i<flagsToPlace; i++) {
			if(currentPosition + distanceBetweenThePeaks > peaks.length - 1)
				return false;
			currentPosition = peaks[currentPosition + distanceBetweenThePeaks];
		}
		return currentPosition < peaks.length;
	}


	public static void main(String[] args) {
		System.out.println(new Flags().solution(new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2,5,7,9}));
	}
}

