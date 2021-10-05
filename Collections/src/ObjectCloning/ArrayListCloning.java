package ObjectCloning;

import java.util.ArrayList;

public class ArrayListCloning {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("ratan");
		l.add("durga");
		l.add("bunty");

		ArrayList<String> l2 = (ArrayList<String>) l.clone();
		System.out.println(l2);
	}

}
