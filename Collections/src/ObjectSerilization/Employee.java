package ObjectSerilization;

import java.io.Serializable;

public class Employee implements Serializable {
	int eId;
	String eName;
	// transient String eName;
	// if we make variable transient then that variable
	// doesnt follow serilization and it gives default values ie null

	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
}
