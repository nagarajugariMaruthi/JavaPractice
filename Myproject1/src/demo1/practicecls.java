package demo1;

public class practicecls {
	public class Student {
	    private int id;
	    private String name;
	    private String email;

	    // getters and setters
	    @RestController
	    @RequestMapping("/students")
	    public class StudentController {

	        private Map<Integer, Student> studentDB = new HashMap<>();

	        @PostMapping
	        public String addStudent(@RequestBody Student student) {
	            studentDB.put(student.getId(), student);
	            return "Student added";
	        }

	        @GetMapping
	        public Collection<Student> getAll() {
	            return studentDB.values();
	        }

	        @DeleteMapping("/{id}")
	        public String delete(@PathVariable int id) {
	            studentDB.remove(id);
	            return "Deleted";
	        }
	    }
	}
}
