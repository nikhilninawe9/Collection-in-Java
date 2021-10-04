package SetByR;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSExample4 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		for (int i = 1; i <= 10; i++)
			t.add(i);
		System.out.println(t);

		// subset
		SortedSet<Integer> s1 = t.subSet(3, 7);
		TreeSet<Integer> t1 = new TreeSet<Integer>(s1);
		System.out.println(t1);// [3, 4, 5, 6]

		// tailset
		SortedSet<Integer> s2 = t.tailSet(4);
		TreeSet<Integer> t2 = new TreeSet<Integer>(s2);
		System.out.println(t2);// [4, 5, 6, 7, 8, 9, 10]
	}

}
