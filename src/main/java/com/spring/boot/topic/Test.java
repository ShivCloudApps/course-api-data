package com.spring.boot.topic;

public class Test {
	
	boolean find;
	
	public Test(String a) {		
	}
	
	public void nonStatic() {
		staticMethod();
		System.out.println("not static");
	}
	public static void staticMethod() {
		System.out.println("static");
		
	}
	public static void main(String args[]) {
		Test test = new Test("");
		test.nonStatic();
		//System.out.println(test.find);
	}
}
