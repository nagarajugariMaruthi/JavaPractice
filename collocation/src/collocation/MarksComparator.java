package collocation;

	import java.util.Comparator;

	public class MarksComparator implements Comparator<Student> {

	    @Override
	    public int compare(Student s1, Student s2) {

	        return Integer.compare(s2.marks, s1.marks);
	    }
	}