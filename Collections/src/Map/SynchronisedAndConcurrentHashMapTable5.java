package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronisedAndConcurrentHashMapTable5 {

	// in this: how to make synchronised hashmap?, difference bet synchronised and
	// concurrent hashmap?, diff bet hashtable and concurrent hashmap?

	public static void main(String[] args) {

		// Hashmap is not synchronised by default [not thread safe, multiple threads
		// attack at same time]
		// so we need to make it synchronised version of hashmap by:
		// 1. either use hashtable
		// 2. synchronised map
		// 3. use concurrent hashmap [best suitable thing]

		// SynchronisedMap methods in collection class
		Map<String, String> map1 = new HashMap<>();
		map1.put("1", "Macbook");
		map1.put("2", "Dell PC");
		map1.put("3", "Asus Notebook");
		map1.put("4", "Lenovo Ideapad");

		// create synchronised map
		Map<String, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);

		// create ConcurrentHashMap [It doesnot throw any
		// ConcurrentModificationException]
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("A", "Nikhil");
		concurrentHashMap.put("B", "Ansh");
		concurrentHashMap.put("C", "Rohini");
		System.out.println(concurrentHashMap.get("C"));

	}

}
