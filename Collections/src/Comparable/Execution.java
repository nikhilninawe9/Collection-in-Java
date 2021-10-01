package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Execution {

	public static void main(String[] args) {
		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(new Employee(222, "Bunty"));
		a1.add(new Employee(444, "Anu"));
		a1.add(new Employee(333, "Carlos"));
		a1.add(new Employee(111, "Faf"));

		Collections.sort(a1);// Behind the scene compareTo method will execute

		a1.forEach(emp -> System.out.println(emp.eid + " " + emp.ename));
	}

}
