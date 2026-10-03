package com.java.basic;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Studentcheck {
	void chcek(Student Student);
}

public class Student {
	
	int id;
	String name;
	double Marks;
	
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		Marks = marks;
	}
}