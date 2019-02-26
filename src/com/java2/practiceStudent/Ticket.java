package com.java2.practiceStudent;

public class Ticket {
	int time;
	String name;
	String fromdepart;
	public Ticket(int time, String name, String fromdepart) {
		this.name=name;
		this.fromdepart=fromdepart;
		this.time= time;
	}
	public void print() {
		System.out.println(time+"\t"+fromdepart+"\t"+name);
	}
	
}
