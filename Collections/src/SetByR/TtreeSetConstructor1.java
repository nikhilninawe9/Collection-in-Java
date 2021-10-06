package SetByR;

import java.util.TreeSet;

public class TtreeSetConstructor1{
// automatic sorting order is there so only homogeneous data allowed and only 1 null values can be there
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("ratan");
		t.add("anu");
		t.add("durga");
		t.add("sravys");
		System.out.println(t);// [anu, durga, ratan, sravys]

		TreeSet<Integer> t1 = new TreeSet<>();
		t1.add(21);
		t1.add(32);
		t1.add(11);
		t1.add(19);
		System.out.println(t1);// [11, 19, 21, 32]

//		TreeSet t2 = new TreeSet<>();
//		t2.add(12);
//		t2.add("xxx");
		// System.out.println(t2);// java.lang.ClassCastException

		TreeSet t3 = new TreeSet<>();
		t3.add("hjfdgh");
		t3.add(null);
		System.out.println(t3);// java.lang.NullPointerException
	}

}
