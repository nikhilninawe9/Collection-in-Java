package MapByR;

import java.util.SortedMap;
import java.util.TreeMap;

//sorted map as an argument in constructor
public class TreeMapFirstConstructor3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<>();
		t1.put(1, "ratan");
		t1.put(20, "anu");
		t1.put(41, "puru");
		t1.put(21, "nikku");
		t1.put(65, "ramu");
		t1.put(87, "anshu");
		t1.put(66, "ronu");
		System.out.println(t1);

		SortedMap<Integer, String> sm1 = t1.subMap(10, 66);// 66 not included
		TreeMap<Integer, String> t2 = new TreeMap<>(sm1);
		System.out.println(t2);// {20=anu, 21=nikku, 41=puru, 65=ramu}

		SortedMap<Integer, String> sm2 = t1.tailMap(60);
		TreeMap<Integer, String> t3 = new TreeMap<>(sm2);
		System.out.println(t3);// {65=ramu, 66=ronu, 87=anshu}

		SortedMap<Integer, String> sm3 = t1.headMap(20);
		TreeMap<Integer, String> t4 = new TreeMap<>(sm3);
		System.out.println(t4);// {1=ratan}
	}

}
