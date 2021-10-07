package MapByR;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
//		return i1.compareTo(i2);//this is for ascending
		return -i1.compareTo(i2);
	}

}

public class TreeMapConstructor4 {
//TreeMap with comparator argument
	public static void main(String[] args) {
		TreeMap<Integer, String> t1 = new TreeMap<>();
		t1.put(1, "ratan");
		t1.put(32, "durga");
		t1.put(12, "bunty");
		t1.put(5, "sravya");
		System.out.println(t1);// {1=ratan, 5=sravya, 12=bunty, 32=durga}
		// this will give me bydefault ascending order

		// for descending order
//		TreeMap<Integer, String> t1 = new TreeMap<>(new MyComparator());
//		t1.put(1, "ratan");
//		t1.put(32, "durga");
//		t1.put(12, "bunty");
//		t1.put(5, "sravya");
//		System.out.println(t1);// {32=durga, 12=bunty, 5=sravya, 1=ratan}
	}

}
