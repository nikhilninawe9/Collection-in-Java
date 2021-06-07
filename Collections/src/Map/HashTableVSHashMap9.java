package Map;

import java.util.Hashtable;

public class HashTableVSHashMap9 {

	// Properties: It is Legacy collection API
	// HashTable is synchronised, Not allowed any null key and null value, Initial
	// capacity is 11 (segments) LF=0.75
	public static void main(String[] args) {

		Hashtable<Integer, String> map1 = new Hashtable<>();
		map1.put(1000, "Amar Singh");
		map1.put(2000, "Vijay Hazare");
		map1.put(500, "Rahul Dravid");
		map1.put(1500, "A B Deviller");
		map1.put(200, "D K Bose");
		System.out.println(map1.get(500));
	}

}
