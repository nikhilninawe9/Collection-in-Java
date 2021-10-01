package Comparator;

import java.util.Comparator;

public class SortProductIdByComparator implements Comparator<Product> {

	// For Ascending order
//	@Override
//	public int compare(Product p1, Product p2) {
//		if (p1.id == p2.id)
//			return 0;
//		else if (p1.id > p2.id)
//			return 1;
//		else
//			return -1;
//	}

	// For Descending order
	public int compare(Product p1, Product p2) {
		if (p2.id == p1.id)
			return 0;
		else if (p2.id > p1.id)
			return 1;
		else
			return -1;
	}

}
