package com.lti.challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CodilityChallenge {
	
	public static String solution(String S) {
		String[] list = S.split("\n");
		System.out.println(Arrays.toString(list));
		HashMap<String, String> hm = new HashMap<>();
		
		for(int i=0;i<list.length;i++) {
			 String[] s = list[i].split(",");
			 hm.put(s[0], s[1].split(" ")[0]+s[1].split(" ")[1]);
		}
		
		System.out.println(hm.toString());
		return S;
	}
	public static void main(String[] args) {
		String S = "Warsaw, 2013-09-05 14:08:15 john.png\n" + 
				" London, 2015-06-20 15:13:22 my-Friends.png\n" + 
				" Warsaw, 2013-09-05 14:07:13 Eiffel.jpg\n" + 
				" Paris, 2015-07-23 08:03:02 pisatower.jpg\n" + 
				" Paris, 2015-07-22 23:59:59 BOB.ipg\n" + 
				" London, 2015-08-05 00:02:03 notredame.png\n" + 
				" Paris, 2015-09-01 12:00:00 me.jpg\n" + 
				" Warsaw, 2013-09-06 15:40: 22 a.png\n" + 
				" Warsaw, 2016-02-13 13:33:50 b.jpg\n" + 
				" Warsaw, 2016-01-02 15:12:22 c.jpg\n" + 
				" Warsaw, 2016-01-02 14:34:30 d.jpg\n" + 
				" Warsaw, 2016-01-02 15:15:01 e.png\n" + 
				" Warsaw, 2016-01-02 09:49:09 f.png\n" + 
				" Warsaw, 2016-01-02 10:5:32 g.jpg\n" + 
				" Warsaw, 2016-02-29 22:13:11\n";
		
		solution(S);
		
        
	}
}
