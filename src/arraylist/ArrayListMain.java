package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Ishwar", "K", 20));
		employeeList.add(new Employee("Sristy", "A", 20));
		employeeList.add(new Employee("Divya", "S", 20));
		employeeList.add(new Employee("Jeevitha", "R", 20));
		employeeList.forEach(employee -> System.out.println(employee));

		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (Employee e : employeeArray)
			System.out.println(e);
	}

}
