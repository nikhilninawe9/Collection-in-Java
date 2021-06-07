package Vector;

import java.util.Vector;

//Vector 2D, vector inside the vector
public class Vector2D {
	public static void main(String[] args) {
		Vector<String> vectorLanguage = new Vector<>();
		vectorLanguage.add("Java");
		vectorLanguage.add("Ruby");
		vectorLanguage.add("Python");

		Vector vectorOs = new Vector();
		vectorOs.add(vectorLanguage);

		for (int i = 0; i < vectorLanguage.size(); i++) {
			String str = ((Vector<String>) vectorOs.get(0)).get(i);
			System.out.println(str);
		}
	}

}
