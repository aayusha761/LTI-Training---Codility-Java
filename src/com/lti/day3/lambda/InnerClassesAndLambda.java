package com.lti.day3.lambda;

class Outer {
	private int x=10;

	//inner classes can have access to private members as well
	class Inner {
		void check() {
			System.out.println(x);
		}
	}
	
	static class InnerClass {
		void check() {
			System.out.println("Just checking..");
		}
	}
}

interface Printer {
	
	void print(String document);
}

class DotMatrixPrinter implements Printer {

	@Override
	public void print(String document) {
		System.out.println(document);
	}
	
}
public class InnerClassesAndLambda {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.check();
		
		Outer.InnerClass ic = new Outer.InnerClass();
		ic.check();
		
		Printer p = new DotMatrixPrinter();
		p.print("xyz");
		
		
		//anonymous inner class
		Printer pt = new Printer() {
			
			@Override
			public void print(String document) {
				System.out.println(document);
				
			}
		};
		pt.print("h");
		
		
		
		//now lambda expressions
		Printer pn = document -> {
			System.out.println(document);
		};
		pn.print("Hi");
		
	}
}