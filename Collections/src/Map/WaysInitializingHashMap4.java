package Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysInitializingHashMap4 {

	// reference for 2. static way
	public static Map<String, Integer> marksMap;

	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {

		// 1. Using HashMap class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();

		// 2. Static way: Static hashmap
		System.out.println(WaysInitializingHashMap4.marksMap.get("A"));

		// 3. Immutable map with only 1 single entry
		Map<String, Integer> map3 = Collections.singletonMap("Ansh", 007);
		System.out.println(map3.get("Ansh"));
		// map3.put("Bunty", 200);// UnsupportedOperationException

		// 4. JDK 8
		Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "A Grade" }, { "Lisa", "B Grade" } })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Bunty", "A++ Grade");
		System.out.println(map4);

		// 5. Using Simple entry
		Map<String, String> map5 = Stream
				.of(new AbstractMap.SimpleEntry<>("Nikhil", "Java"), new AbstractMap.SimpleEntry<>("Ron", "Python"),
						new AbstractMap.SimpleEntry<>("Shashank", "Oracle"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("Shashank"));
		map5.put("Lisa", "C#");
		System.out.println(map5);

		// 6. (jdk 1.9) To get empty Map
		Map<String, String> emptyMap = Map.of();
		System.out.println(emptyMap);
		// emptyMap.put("One", "1");
		// System.out.println(emptyMap.get("One"));// UnsupportedOperationException
		// we cant add anythin gin empty map

		// 7. (jdk 1.9) singleton map
		Map<String, String> singletonMap = Map.of("One", "1");
		System.out.println(singletonMap.get("One"));
		// singletonMap.put("xxx", "qqq");
		// System.out.println(singletonMap);// UnsupportedOperationException
		// we cant add entry in singleton map because it must contain only 1 key value
		// pair as it is singleton

		// 7. (jdk 1.9) Multi Value Map [limitation: max 10 pairs can be sorted]
		Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
		System.out.println(multiMap.get("k2"));
		// AND
		// [Here no limitations for key and value pair]
		Map<String, Integer> map0 = Map.ofEntries(new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 200), new AbstractMap.SimpleEntry<>("C", 300));
		System.out.println(map0.get("B"));
//		map0.put("D", 400);
//		System.out.println(map0);// UnsupportedOperationException
		// we cant add anythin gin as it is immutable

		// 8. Maps using Guava
		// need to add dependency to compile guava collection
		// Map<String, String> titleMaps = ImmutableMap.of("Google", "Google India",
		// "Amazon", "Amazon India");
		// System.out.println(titleMaps.get("Amazon"));
		// we cant put anythins since it is immutable gives[//
		// UnsupportedOperationException]
	}

}
