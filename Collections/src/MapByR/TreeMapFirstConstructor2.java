package MapByR;

import java.util.TreeMap;

//inserting 1 map data to another map
public class TreeMapFirstConstructor2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> t1 = new TreeMap<>();
		t1.put("ratan", 111);

		// t1 data into t2
		TreeMap<String, Integer> t2 = new TreeMap<>(t1);
		t2.put("anup", 222);
		System.out.println(t2);
		// Above is constructor approach

		// putAll()
		TreeMap<String, Integer> a1 = new TreeMap<>();
		a1.put("qwe", 1);
		TreeMap<String, Integer> a2 = new TreeMap<>();
		a2.put("eww", 2);
		// I want to add a1 & a2 into a3 [cant do with constructor aproach]
		TreeMap<String, Integer> a3 = new TreeMap<>();
		a3.putAll(a1);
		a3.putAll(a2);
		a3.put("hjgfd", 3);
		System.out.println(a3);
	}

}
