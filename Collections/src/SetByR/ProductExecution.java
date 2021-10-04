package SetByR;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompProduct implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return -p1.name.compareTo(p2.name);
	}

}

public class ProductExecution {

	public static void main(String[] args) {
		TreeSet<Product> t1 = new TreeSet<Product>(new MyCompProduct());
		t1.add(new Product(111, "chair", 12.00));
		t1.add(new Product(222, "table", 15.00));
		t1.add(new Product(999, "computer", 99.00));
		t1.add(new Product(777, "mobile", 65.00));

		t1.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.cost));
	}

}
