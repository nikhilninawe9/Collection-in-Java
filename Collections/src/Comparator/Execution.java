package Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class Execution {
//Ascending order sorting
	public static void main(String[] args) {
		LinkedList<Product> i = new LinkedList<Product>();
		i.add(new Product(11, "Zipper", 10.54));
		i.add(new Product(44, "Apple", 12.34));
		i.add(new Product(33, "Sharpner", 23.54));
		i.add(new Product(22, "Onion", 10.669));

		// For id sorting
		// Collections.sort(i, new SortProductIdByComparator());
		// Output
//		11 Zipper
//		22 Onion
//		33 Sharpner
//		44 Apple

		// For name sorting
		Collections.sort(i, new SortProductNameByComparator());
		// Output
//		 44 Apple
//		22 Onion
//		33 Sharpner
//		11 Zipper

		for (Product prod : i) {
			System.out.println(prod.id + " " + prod.name);
		}
	}

}
