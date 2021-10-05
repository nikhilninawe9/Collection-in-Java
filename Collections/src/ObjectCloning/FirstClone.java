package ObjectCloning;

public class FirstClone implements Cloneable {
	int a = 10, b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		FirstClone fc1 = new FirstClone();
		System.out.println(fc1.a);
		System.out.println(fc1.b);

		FirstClone fc2 = (FirstClone) fc1.clone();
		System.out.println(fc2.a + "| " + fc2.b);
	}

}
