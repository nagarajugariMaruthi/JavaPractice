package collocation;

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;

	class Student_1 {

	    int id;
	    String name;
	    int marks;
	    int age;

	    Student_1(int id, String name, int marks, int age) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name + " " + marks + " " + age;
	    }
	}
