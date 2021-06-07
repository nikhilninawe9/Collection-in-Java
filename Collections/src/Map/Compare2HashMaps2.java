package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Compare2HashMaps2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");

		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// 1. On the basis of key-value: use equals method
		System.out.println(map1.equals(map2));// true
		System.out.println(map1.equals(map3));// false

		// 2. Compare 2 mahsmaps for the same keys: use keyset
		System.out.println(map1.keySet().equals(map2.keySet()));// true
		System.out.println(map1.keySet().equals(map3.keySet()));// true (this is the difference with keyvalue)

		// 3. Find out the extra keys
		HashMap<Integer, String> map4 = new HashMap<>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		// combine the keys from both hashmaps: Use hashset
		HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
		// add the keyset from map4:
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys);

		// 4. Compare maps by values
		HashMap<Integer, String> map5 = new HashMap<>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		HashMap<Integer, String> map6 = new HashMap<>();
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");

		HashMap<Integer, String> map7 = new HashMap<>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");

		// duplicates are not allowed using arraylist
		// comparing in terms of values
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));// true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));// false
		System.out.println("********************************");

		// duplicates are allowed using hashset
		// comparing in terms of values
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));// true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));// true
	}
}
