package com.lti.challenge;
public class SMSMessages {
	
	private static int solution(String s, int k) {
		// TODO Auto-generated method stub
//		System.out.println(s.length());
		String[] words = s.split(" ");
		for(String word:words) {
			if(word.length() > k) return -1;
		}
		
		int count = 1;

		
		int size = words[0].length();
		for(int i=1;i<words.length;i++) {
			if (size + 1 + words[i].length() <= k) {
			      size = size + 1 + words[i].length();
			}
			else {
	          count ++;
	          size = words[i].length();
	        }
			
		}
//		System.out.println(count);
		return count;
		
	}
	public static void main(String[] args) {
		String S="SMS messages are really short and simple";	//5
		int K = 12;
		
		String S1 = "Hello";
		int K1 = 1;
//		O = -1;
		
		String S2= "Hello";
		int K2 = 2;
//		O = -1;
		
		String S3 = "Hello";
		int K3 = 5;
//		O = 1;
		
		String S4 = "Hello Everyone";
		int K4 = 5;
//		O = -1;
		
		String S5 = "Hello Everyone";
		int K5 = 8;
//		O = 2;

		System.out.println(solution(S,K));
		System.out.println(solution(S1, K1));
		System.out.println(solution(S2, K2));
		System.out.println(solution(S3, K3));
		System.out.println(solution(S4, K4));
	}
}