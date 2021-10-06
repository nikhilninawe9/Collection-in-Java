package SetByR;

import java.util.Comparator;
import java.util.TreeSet;

//Comparator constructor in TreeMap
class MyCompString implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}// create sorting in descending

}

class MyCompInt implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);// create sorting in descending
	}

}

public class TreeSetVsComparator {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<String>(new MyCompString());
		t1.add("ratan");
		t1.add("anu");
		t1.add("sravya");
		t1.add("durga");
		System.out.println(t1);

		TreeSet<Integer> t2 = new TreeSet<Integer>(new MyCompInt());
		t2.add(10);
		t2.add(2);
		t2.add(20);
		t2.add(7);
		System.out.println(t2);
	}

}
