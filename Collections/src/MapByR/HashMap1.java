package MapByR;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<>();
		h1.put(111, "ratan");
		h1.put(444, "durga");
		h1.put(222, "sravya");
		h1.put(333, "bloody");
		System.out.println(h1);

		// retrieve ikeys only
		Set<Integer> keys = h1.keySet();
		System.out.println(keys);

		// retrieve values
		Collection<String> values = h1.values();
		System.out.println(values);

		// now key value pairs
		Set<Entry<Integer, String>> entries = h1.entrySet();
		System.out.println(entries);
		entries.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
	}

}
