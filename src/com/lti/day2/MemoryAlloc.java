package com.lti.day2;

public class MemoryAlloc {
	public static void main(String[] args) {

		System.out.println("Max Memory : "+Runtime.getRuntime().maxMemory()+" bytes approx");
		System.out.println("Total Memory : "+Runtime.getRuntime().totalMemory()+" bytes approx");
		System.out.println("Free Memory : "+Runtime.getRuntime().freeMemory()+" bytes approx");
		
		System.out.println("Available Processors : "+Runtime.getRuntime().availableProcessors());  

	}
}