package com.codility.lesson5;
import java.util.*;
public class GenomicRangeQuery {
	public static int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        List<String> list = new ArrayList<String>();
        List<Character> list1 = new ArrayList<Character>();
        // System.out.println(S.length());

        for(int i=0;i<P.length;i++) {
            if(Q[i]+1>=S.length()) {
                // System.out.println(S.substring(P[i]));
                char[] temp = S.substring(P[i]).toCharArray();
                Arrays.sort(temp);
        		String c = new String(temp);

                list.add(c);
            }
            else {
                // System.out.println(S.substring(P[i],Q[i]+1));
                char[] temp = S.substring(P[i],Q[i]+1).toCharArray();
                Arrays.sort(temp);
        		String c = new String(temp);

                list.add(c);
            }
        }
        
        // System.out.println("----Display List----");
        // for(String i:list)
        //     System.out.println(i);
        
        // // for(String i:list)
        //     System.out.println(list.size());
            
        System.out.println("----Add items to list1----");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).charAt(0));
            list1.add(list.get(i).charAt(0));
        }
         
        System.out.println("----Display List1----");
        for(int i=0;i<list1.size();i++) {
            System.out.println(list1.get(i));
        }
        
        List<Integer> count = new ArrayList<Integer>();
        
        for(int i=0;i<list1.size();i++) {
            if(list1.get(i) == 'A')
            	count.add(1);
            else if(list1.get(i) == 'C')
            	count.add(2);

            else if(list1.get(i) == 'G')
            	count.add(3);

            else if(list1.get(i) == 'T')
            	count.add(4);
        }
        int[] array = count.stream().mapToInt(i -> i).toArray();
        return array;
    }
	
	public static void main(String[] args) {
		String S="CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		System.out.println(solution(S, P, Q));
//		String s = (String) S.subSequence(3, 4);
//		System.out.println(S.subSequence(3, 4));
		
	}
}
