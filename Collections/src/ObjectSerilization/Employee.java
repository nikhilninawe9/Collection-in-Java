package ObjectSerilization;

import java.io.Serializable;

public class Employee implements Serializable {
	int eId;
	String eName;

	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
}
