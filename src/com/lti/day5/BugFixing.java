package com.lti.day5;

import java.util.Arrays;

public class BugFixing {

	 //return the character that occurs the most frequently in the given string
    //in case of more than one character satisfying the requirement, we need to
    //return the earliest character alphabetically
    String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }
        
//        System.out.println(Arrays.toString(occurrences));
        char best_char = ' ';
        int best_res = 0;
        
//        for (int i = 1; i < 26; i++) {
//            if (occurrences[i] >= best_res) {
//                best_char = (char) ((int) 'a' + i);
//                best_res = occurrences[i];
//            }
//        }
        
        //changes
        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char) ((int) 'a' + i);
                best_res = occurrences[i];
            }
        }

 

        return Character.toString(best_char);
    }
    
    public static void main(String[] args) {
        System.out.println(new BugFixing().solution("apple"));
    	System.out.println(new BugFixing().solution("hello"));
    	System.out.println(new BugFixing().solution("parameter"));
    	System.out.println(new BugFixing().solution("madam"));
    	
    }
}
