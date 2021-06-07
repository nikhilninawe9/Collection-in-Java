package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics1 {
	public static void main(String[] args) {

		// no order- no indexing
		// stores values - key-value format
		// keys cant be duplicate values can be..
		// can store n number of null values but 1 null keys
		// hashmap is not thread safe not synchronized
		// BUCKET SIZE OR SEGMENT OF HASHMAP IS 16 [0-15 IN INDEXING]

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		// Put Method to add keys and values
		capitalMap.put("India", "New Delhi");
		capitalMap.put("Austraila", "Sydney");
		capitalMap.put("Pakistan", "Karachi");
		capitalMap.put("Turkey", "Istanbul");
		capitalMap.put("China", "Beijing");
		capitalMap.put("China", "Shanghai");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);

		// -----------------------------------------------//
		System.out.println(capitalMap.get("Pakistan"));// Karachi
		System.out.println(capitalMap.get("China"));// Shanghai keys are repiting gives latest value
		System.out.println(capitalMap.get(null));// LA if null value repetes then show latest
		System.out.println(capitalMap.get("Russia"));// null
		System.out.println(capitalMap.get("France"));// null
		System.out.println("------------------------------");

		// -----------------------------------------------//
		// Iterator Over the keys
		Iterator<String> it1 = capitalMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			String value = capitalMap.get(key);
			System.out.println("Key = " + key + " || Value = " + value);
		}
		System.out.println("------------------------------");

		// -----------------------------------------------//
		// Iterator Over the set (pair): by using entrySet (Set means enitire key and
		// value)
		Iterator<Entry<String, String>> it2 = capitalMap.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			System.out.println("Key: " + entry.getKey() + " || Value: " + entry.getValue());
		}

		// Remove Method
		capitalMap.remove("France");
		System.out.println(capitalMap);
		System.out.println("===========================");

		// Iterate hashmap using java8 for-each and lambda
		capitalMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
	}

}
