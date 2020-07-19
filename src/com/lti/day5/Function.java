package com.lti.day5;

import java.util.ArrayList;

public class Function {
	public static void main(String[] args) {
        ArrayList<Integer> st = new ArrayList<Integer>();
        st.add(0);
        st.add(1);
        st.add(0);
//        st.add(0);
        st.add(0);
        
        String str = "";
		for(int i=0;i<st.size();i++) {
			str+=st.get(i);
		}
		
		System.out.println(str);
		String str1 = str.replace("0", " ");
		String[] str2 = str.split("1");
		
//		System.out.println(str1);
		System.out.println(str2.length);
		
//		String str2 = str1.trim();
//		System.out.println(str2);
//		int n=1000;
//        String[] split = str.split("1");
//        System.out.println(split.length);
//        return split.length;
	}
}
