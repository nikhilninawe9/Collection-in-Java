package Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorBasics {
	// Legacy Classes.
	// Launched from java1.0
	// Vectors are Synchronised
	public static void main(String[] args) {
		// Maintains the insertion order.
		Vector<Integer> v1 = new Vector<>();
		v1.add(2);
		v1.add(4);
		v1.add(6);
		v1.add(8);
		v1.add(10);
		v1.add(12);
		v1.add(14);
		v1.add(16);
		System.out.println(v1);// [2, 4, 6, 8, 10, 12, 14, 16]
		System.out.println(v1.get(3));// 8
		v1.remove(2);
		System.out.println(v1);// [2, 4, 8, 10, 12, 14, 16]

		// Add vector from other collectoin
		Vector<Integer> v2 = new Vector<>();
		v2.add(1);
		v2.add(3);
		v1.addAll(v2);
		System.out.println(v1);// [2, 4, 8, 10, 12, 14, 16, 1, 3]

		// Empty the vector
		for (Integer q : v1) {
			System.out.println(q);
		}
		System.out.println("---------------------");

		v1.forEach(w -> System.out.println(w));
		System.out.println("---------------------");

		for (int i = 0; i <= v1.size() - 1; i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("---------------------");

		Iterator i1 = v1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("---------------------");

		// Sorting by Collections
		Collections.sort(v1);
		System.out.println(v1);// [1, 2, 3, 4, 8, 10, 12, 14, 16]

	}

}
