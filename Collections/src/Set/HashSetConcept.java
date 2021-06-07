package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {
	// Duplicates does not allowed, wont show compilation error but will gives
	// latest updated value.
	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<>();
		hs1.add("Ansh");
		hs1.add("Bob");
		hs1.add("Ronny");
		hs1.add("Stacey");
		hs1.add("Ansh");
		hs1.add(null);
		System.out.println("----------------------------------------");
		System.out.println(hs1);
		System.out.println("----------------------------------------");
		System.out.println(hs1.contains("Ronny"));
		System.out.println("----------------------------------------");
		for (String h : hs1) {
			System.out.println(h);
		}
		System.out.println("----------------------------------------");
		hs1.remove("Ansh");
		System.out.println(hs1);// [null, Bob, Stacey, Ronny]
		System.out.println("----------------------------------------");

		Iterator it = hs1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------");

		// Mathmatical Operations
		Set<Integer> first = new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));

		Set<Integer> second = new HashSet<>();
		first.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 5, 6, 7, 9 }));

		// Union (Combine) both the sets
		// [Same values from both the sets will appear once]
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println("----------------------------------------");
		// OR
		Set<Integer> union1 = new HashSet<Integer>();
		union1.addAll(first);
		union1.addAll(second);
		System.out.println(union1);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println("----------------------------------------");

		// Get the intersection
		Set<Integer> one = new HashSet<>();
		one.addAll(Arrays.asList(new Integer[] { 2, 4, 3, 9, 8, 7, 44, 55 }));

		Set<Integer> two = new HashSet<>();
		two.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 5, 9, 4 }));

		Set<Integer> intersection = new HashSet<Integer>(one);
		intersection.retainAll(two);
		System.out.println(intersection);// [2, 3, 4, 9]
		System.out.println("----------------------------------------");

		// Get the difference
		Set<Integer> difference = new HashSet<Integer>(one);
		difference.removeAll(two);
		System.out.println(difference);// [7, 55, 8, 44]
		System.out.println("----------------------------------------");

	}

}
