package MapByR;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StudentEmployeeExecution {

	public static void main(String[] args) {
		LinkedHashMap<Employee, Student> l1 = new LinkedHashMap<>();
		l1.put(new Employee(1, "Nikhil"), new Student(111, "Ansh"));
		l1.put(new Employee(2, "Shashank"), new Student(222, "Rohini"));

		Set<Employee> employees = l1.keySet();
		// System.out.println(employees);//hashcode
		employees.forEach(e -> System.out.println(e.eId + " " + e.eName));

		l1.values().forEach(s -> System.out.println(s.sId + " " + s.sName));

		Set<Entry<Employee, Student>> entries = l1.entrySet();
		Iterator<Entry<Employee, Student>> itr = entries.iterator();
		while (itr.hasNext()) {
			Entry<Employee, Student> entry = itr.next();
			Employee ee = entry.getKey();
			Student ss = entry.getValue();
			System.out.println(("Employee details: " + ee.eId + " " + ee.eName));
			System.out.println(("Student details: " + ss.sId + " " + ss.sName));
		}
	}
}
