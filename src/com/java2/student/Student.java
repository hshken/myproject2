package com.java2.student;

public class Student {
	String name;
	int English;
	public Student(String name, int english) {
		this.name=name;
		this.English=english;
		}
		public void print() {
			System.out.println(name + "\t" + English);
		
	}
}
