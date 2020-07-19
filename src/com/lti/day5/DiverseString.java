package com.lti.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DiverseString {
	
	private static String solution(int a, int b, int c) {

		int[] count = new int[a+b+c];
		
		List<String> list = new ArrayList<String>();
        String result  = "";
        

		
        if(a>=b && a>=c) {
        	System.out.println("Hi");
			int count1 = a;
			int count2 = b;
			int count3 = c;
			
			int countA=0;
			int countB=0;
			int countC=0;
			for(int i=0;i<count.length;i++) {
				String temp = "";
				if(count1>0  && (countA+1)%3!=0) {
					temp = "a";
					list.add(temp);
					count1--;
					
					countA++;
					countB=0;
					countC=0;
				}
				else if(count2>0  && (countB+1)%3!=0 && count2>=count3) {
					temp = "b";
					list.add(temp);
					count2--;
					
					countB++;
					countC=0;
					countA=0;
					
				}
				else if(count3>0  && (countC+1)%3!=0 && count2>=count3) {
					temp = "c";
					list.add(temp);
					count3--;
					
					countC++;
					countA=0;
					countB=0;
				}

				else if(count3>0  && (countC+1)%3!=0 && count3>count2) {
					temp = "c";
					list.add(temp);
					count3--;
					
					countC++;
					countA=0;
					countB=0;
				}
				else if(count2>0  && (countB+1)%3!=0 && count3>count2) {
					temp = "b";
					list.add(temp);
					count2--;
					
					countB++;
					countC=0;
					countA=0;
					
				}
				if(temp == "") break;
			}

			for(String s:list)
				result+=s;
			System.out.println(result);
		}
        
		else if(b>=c && b>=a) {
        	System.out.println("Hello");
        	int count1 = a;
			int count2 = b;
			int count3 = c;
			
			int countA=0;
			int countB=0;
			int countC=0;
			for(int i=0;i<count.length;i++) {
				String temp = "";
				if(count2>0 && (countB+1)%3!=0) {
					temp = "b";
					list.add(temp);
					count2--;
					
					countB++;
					countC=0;
					countA=0;
				}
				else if(count3>0 && (countC+1)%3!=0 && count3>=count1) {
					temp = "c";
					list.add(temp);
					count3--;
					
					countC++;
					countA=0;
					countB=0;
				}
				else if(count1>0 && (countA+1)%3!=0 && count3>=count1) {
					temp = "a";
					list.add(temp);
					count1--;
					
					countA++;
					countB=0;
					countC=0;
				}

				else if(count1>0 && (countA+1)%3!=0 && count1>count3) {
					temp = "a";
					list.add(temp);
					count1--;
					
					countA++;
					countB=0;
					countC=0;
				}
				else if(count3>0 && (countC+1)%3!=0 && count1>count3) {
					temp = "c";
					list.add(temp);
					count3--;
					
					countC++;
					countA=0;
					countB=0;
				}
				if(temp == "") break;
				
			}
	
			for(String s:list)
				result+=s;
			System.out.println(result);
		}   
        
		else if(c>=b && c>=a) {
        	System.out.println("Namaste");
        	int count1 = a;
			int count2 = b;
			int count3 = c;

			int countA=0;
			int countB=0;
			int countC=0;
			for(int i=0;i<count.length;i++) {
				String temp = "";
				if(count3>0 && (countC+1)%3!=0) {
					temp = "c";
					list.add(temp);
					--count3;
					
					countC++;
					countB=0;
					countA=0;
				}
				
				else if(count1>0 && (countA+1)%3!=0 && count1>=count2) {
					temp = "a";
					list.add(temp);
					--count1;
					
					countA++;
					countB=0;
					countC=0;
				}
				else if(count2>0 && (countB+1)%3!=0 && count1>=count2) {
					temp = "b";
					list.add(temp);
					--count2;
					
					countB++;
					countC=0;
					countA=0;
				}
				else if(count2>0 && (countB+1)%3!=0 && count2>count1) {
					temp = "b";
					list.add(temp);
					--count2;
					
					countB++;
					countC=0;
					countA=0;
				}
				else if(count1>0 && (countA+1)%3!=0 && count2>count1) {
					temp = "a";
					list.add(temp);
					--count1;
					
					countA++;
					countB=0;
					countC=0;
				}
				if(temp == "") break;
				
			}
	
			for(String s:list)
				result+=s;
		}
     
		
		return result;
		
	}
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c=7;		//aaaaaaaabc
//		System.out.println(solution(a,b,c));
		
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        s.remove(2);
        System.out.println(s.size());
	}
}
