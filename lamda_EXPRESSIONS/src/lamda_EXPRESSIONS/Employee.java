package lamda_EXPRESSIONS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(1, "Thirumalesh", 38, "Male", "Development", 2012, 95000.0));
		employeeList.add(new Employee(2, "Shailaja", 26, "Female", "HR", 2019, 45000.0));
		employeeList.add(new Employee(3, "Sai Kiran", 24, "Male", "Development", 2023, 55000.0));

		employeeList.add(new Employee(5, "Ravi Kumar", 35, "Male", "Finance", 2014, 75000.0));
		employeeList.add(new Employee(6, "Sneha", 23, "Female", "Testing", 2024, 38000.0));
		employeeList.add(new Employee(7, "Prudhvi", 25, "Male", "Development", 2022, 60000.0));
		employeeList.add(new Employee(8, "Anusha", 30, "Female", "Development", 2017, 85000.0));
		employeeList.add(new Employee(9, "Venkatesh", 42, "Male", "Sales", 2010, 90000.0));
		employeeList.add(new Employee(10, "Divya", 27, "Female", "Finance", 2020, 52000.0));

		employeeList.add(new Employee(11, "Mahesh", 29, "Male", "Testing", 2018, 58000.0));
		employeeList.add(new Employee(12, "Lakshmi", 45, "Female", "HR", 2008, 105000.0));
		employeeList.add(new Employee(13, "Karthik", 22, "Male", "Development", 2025, 42000.0));

		employeeList.add(new Employee(15, "Suresh", 50, "Male", "Finance", 2005, 130000.0));
		employeeList.add(new Employee(16, "Swathi", 32, "Female", "Testing", 2016, 72000.0));
		employeeList.add(new Employee(17, "Naveen", 28, "Male", "Support", 2020, 46000.0));
		employeeList.add(new Employee(18, "Deepika", 25, "Female", "Development", 2022, 62000.0));
		employeeList.add(new Employee(19, "Rajesh", 40, "Male", "HR", 2011, 88000.0));
		employeeList.add(new Employee(20, "Meghana", 29, "Female", "Support", 2019, 49000.0));

		employeeList.add(new Employee(21, "Arjun", 26, "Male", "Sales", 2021, 47000.0));
		employeeList.add(new Employee(22, "Kavya", 31, "Female", "Finance", 2015, 68000.0));
		employeeList.add(new Employee(23, "Harish", 34, "Male", "Development", 2013, 110000.0));
		employeeList.add(new Employee(24, "Sravani", 22, "Female", "Testing", 2025, 35000.0));
		employeeList.add(new Employee(25, "Manoj", 27, "Male", "Support", 2021, 44000.0));

		employeeList.add(new Employee(27, "Ajay", 23, "Male", "Testing", 2024, 39000.0));
		employeeList.add(new Employee(28, "Keerthi", 28, "Female", "HR", 2020, 51000.0));
		employeeList.add(new Employee(29, "Rohit", 33, "Male", "Support", 2016, 65000.0));
		employeeList.add(new Employee(30, "Nandini", 24, "Female", "Development", 2023, 56000.0));

		employeeList.add(new Employee(26, "Bhavani", 36, "Female", "Sales", 2014, 78000.0));
		employeeList.add(new Employee(14, "Pooja", 24, "Female", "Sales", 2023, 40000.0));
		employeeList.add(new Employee(4, "Priya", 28, "Female", "Sales", 2018, 48000.0));

//		1. How many male and female employees are there in the organization ? 

		Map<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);

//		2. Print the name of all departments in the organization ? 

		List<String> deptList = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());

		System.out.println(deptList);

//	     3. What is the average age of male and female employees ?   
		Map<String, Double> mfAvg = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(mfAvg);

//	     4. Get the details of highest paid employee in the organization ? 

		Optional<Employee> maxEmp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		if (maxEmp.isPresent()) {
			Employee employee = maxEmp.get();
			System.out.println(employee);
		}

		Optional<Employee> minEmp = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

		if (minEmp.isPresent()) {
			Employee employee = minEmp.get();
			System.out.println(employee);
		}

//		5. Get the names of all employees who have joined after 2015 ? 

		List<String> allEmpNames = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
				.map(Employee::getName).collect(Collectors.toList());
		System.out.println(allEmpNames);

//		  6. Count the number of employees in each department ?
		Map<String, Long> collect2 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(collect2);

//	  7. What is the average salary of each department ?	

		Map<String, Double> collect3 = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect3);

//	8. Get the details of youngest male employee in the Development department ?
		Optional<Employee> collect4 = employeeList.stream().filter(
				emp -> emp.getGender().equalsIgnoreCase("Male") && emp.getDepartment().equalsIgnoreCase("Development"))
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));

		if (collect4.isPresent()) {
			Employee employee = collect4.get();
			System.out.println(employee);
		}

		Optional<Employee> collect5 = employeeList.stream().filter(
				emp -> emp.getGender().equalsIgnoreCase("Male") && emp.getDepartment().equalsIgnoreCase("Development"))
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));

		if (collect5.isPresent()) {
			Employee employee = collect5.get();
			System.out.println(employee);
		}

//		9. Who has the most working experience in the organization ?

		Optional<Employee> collect6 = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(collect6);

		Optional<Employee> collect7 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining)));
		System.out.println(collect7);

//	   10. How many male and female employees are there in the Sales team ?

		Map<String, Long> collect8 = employeeList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect8);

//	   11. What is the average salary of male and female employees ?

		Map<String, Double> collect9 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect9);

//	   12. List down the names of all employees in each department ?
		List<String> collect10 = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(collect10);
//		13.  What is the average salary and total salary of the whole organization ?

		double sum = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		double avg = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getAverage();
		System.out.println(sum);
		System.out.println(avg);
		
		Map<Boolean, List<Employee>> collect11 = employeeList.stream().collect(Collectors.partitioningBy(emp->emp.getAge() <= 25));
       System.out.println(collect11.get(true));
       System.out.println(collect11.get(false));
	}

}
	


