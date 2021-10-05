package ObjectSerilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeExecutionCollection {

	void deserilizationDemo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		System.out.println(e.eId + " " + e.eName);
		ois.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(111, "Ratan"));
		al.add(new Employee(222, "Jatan"));
		al.add(new Employee(333, "Madan"));

		// Serialization Process
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("Serilization process completed");

		// DeSerialization Process
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Employee> a = (ArrayList<Employee>) ois.readObject();
		a.forEach(a1 -> System.out.println(a1.eId + " " + a1.eName));
		ois.close();
	}

}
