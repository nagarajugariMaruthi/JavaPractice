package com.maruthi.project;

public class Students {

	    String name;

	    Students(String name) {
	        this.name = name;
	    }
	}

	class Teacher {

	    String teacherName;

	    Teacher(String teacherName) {
	        this.teacherName = teacherName;
	    }

	    void display(Students[] students) {

	        System.out.println("Teacher: " + teacherName);

	        for (Students s : students) {
	            System.out.println("Students: " + s.name);
	        }
	    }
	}