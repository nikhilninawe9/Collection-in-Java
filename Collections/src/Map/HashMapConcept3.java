package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept3 {
	public static void main(String[] args) {

		// Very important point hashcode of null is always 0
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Tom", 100);
		marks.put("Dick", 150);
		marks.put("Harry", 125);
		marks.put("Russel", 200);
		marks.put("Peter", 300);
		marks.put("Arnold", 400);
		marks.put(null, 655);
		marks.put(null, 744);
		marks.put("Ryan", 500);
	}
}
