package ObjectSerilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeExecution {

	void serilizationDemo() throws IOException {
		Employee e = new Employee(111, "Nikhil");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("Serilization process completed");
	}

	void deserilizationDemo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		System.out.println(e.eId + " " + e.eName);
		ois.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeExecution e = new EmployeeExecution();
		e.serilizationDemo();
		e.deserilizationDemo();
		// Serilization process completed
		// 111 Nikhil
	}

}
