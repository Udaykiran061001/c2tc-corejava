package com.cg.statickeyword;

public class StudentOne {
	
	int id;
	static String collegeName="bitm";
	
	static void display() {
		System.out.println(collegeName);
	}
	
	public static void main(String[] args) {
//		display(); // correct
		StudentOne.display(); // correct
	}
}
