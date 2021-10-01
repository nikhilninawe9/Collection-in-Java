package Comparable;

public class Employee implements Comparable<Employee> {
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	// Sorting of id logic w/o generics
//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee) o;// type casted object to employee
//		if (eid == e.eid)
//			return 0;
//		else if (eid > e.eid)
//			return 1;
//		else
//			return -1;
//	}

	// Sorting of id logic with generics
//	public int compareTo(Employee e) {
//		if (eid == e.eid)
//			return 0;
//		else if (eid > e.eid)
//			return 1;
//		else
//			return -1;
//	}

	// Sorting of name logic with generics
	public int compareTo(Employee e) {
		return ename.compareTo(e.ename);
	}
}
