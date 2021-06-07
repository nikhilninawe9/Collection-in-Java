package Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapVsHashMap8 {

	// Hashing is not available in TreeMap
	// sort by order incresing order as per key
	public static void main(String[] args) {

		TreeMap<Integer, String> map1 = new TreeMap<>();
		// Below are salary and number of employees
		map1.put(1000, "Amar Singh");
		map1.put(2000, "Vijay Hazare");
		map1.put(500, "Rahul Dravid");
		map1.put(1500, "A B Deviller");
		map1.put(200, "D K Bose");
		System.out.println(map1);// sort by order incresing order as per key

		map1.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

		// find out upper key
		System.out.println(map1.lastKey());

		// find lowest key
		System.out.println(map1.firstKey());

		// find the salary less than 1000
		Set<Integer> keysLessThan1000 = map1.headMap(1000).keySet();
		System.out.println(keysLessThan1000);// [200, 500]

		// find the salary greater than 1000
		Set<Integer> keysGreaterThan1000 = map1.tailMap(1000).keySet();
		System.out.println(keysGreaterThan1000);// [1000, 1500, 2000]

		TreeMap<String, Integer> map2 = new TreeMap<>();
		// Here sorting will happen in alphabetical manner
		map2.put("Zuber", 900);
		map2.put("Babar", 1200);
		map2.put("Chacha", 300);
		map2.put("Akbar Bin Tabar", 5000);
		map2.put("Shahzia", 250);
		System.out.println(map2);// {Akbar Bin Tabar=5000, Babar=1200, Chacha=300, Shahzia=250, Zuber=900}

		System.out.println("=============================================");
		// Sorting (as per the key) order Working: Refer to image file
		// It converts into the binary tree structure. First entry will be the
		// reference. another entry checks whether it is greater or less than the
		// reference entry.
		// If greater then goes to right side of tree else left side, and simultaneously
		// every entry checks to the reference first then decides left or right then
		// whatever comes into the way it will check with that.
		// Each node will have 1 left and 1 right.

		// If I have to sort keys with the decresing order or reverse alphabetical
		// order. By default it is alphabetical and incresing order.
		TreeMap<String, Integer> map3 = new TreeMap<>(Comparator.reverseOrder());
		// Here sorting will happen in reverse alphabetical manner by using
		// Comparator.reverseOrder()
		map3.put("Zuber", 900);
		map3.put("Babar", 1200);
		map3.put("Chacha", 300);
		map3.put("Akbar Bin Tabar", 5000);
		map3.put("Shahzia", 250);
		System.out.println(map3);// {Zuber=900, Shahzia=250, Chacha=300, Babar=1200, Akbar Bin Tabar=5000}

		// WHen to use HashMap and when to use TreeMap?
		// => when we no need to bother about the sorting order then use HashMap, when
		// we need to use map with sorting feature then use tree map.

	}

}
