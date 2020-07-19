package com.lti.miniproject;

import java.util.List;

public class UI {
	SampleFileReader sfr = new SampleFileReader();
	
	public static void main(String[] args) {
		List<String> date = SampleFileReader.dateReceived;
		for(String d:SampleFileReader.dateReceived) {
			System.out.println(d);
		}
	}
}
