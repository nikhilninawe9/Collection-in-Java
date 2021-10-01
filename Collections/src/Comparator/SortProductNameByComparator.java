package Comparator;

import java.util.Comparator;

public class SortProductNameByComparator implements Comparator<Product> {

	// For Ascending order
//	@Override
//	public int compare(Product p1, Product p2) {
//		return p1.name.compareTo(p2.name);
//	}

	// For Descending order
	@Override
	public int compare(Product p1, Product p2) {
		return p2.name.compareTo(p1.name);
	}

}
