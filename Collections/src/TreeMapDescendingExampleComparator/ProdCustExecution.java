package TreeMapDescendingExampleComparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return -p1.productId.compareTo(p2.productId);
	}
}

public class ProdCustExecution {

	public static void main(String[] args) {
		TreeMap<Product, Customer> t1 = new TreeMap<Product, Customer>(new MyComparator());
		t1.put(new Product(222, "iphone"), new Customer(333, "Jeff Hardy"));
		t1.put(new Product(111, "MacBook"), new Customer(222, "Dale Steyn"));
		t1.put(new Product(999, "ipad"), new Customer(11, "Abu Hamza"));

		Set<Entry<Product, Customer>> e = t1.entrySet();
		Iterator<Entry<Product, Customer>> itr = e.iterator();
		while (itr.hasNext()) {
			Entry<Product, Customer> e1 = itr.next();
		}
		t1.entrySet().forEach(p -> System.out.println(p.getKey().productId + " " + p.getKey().productName));
		t1.entrySet().forEach(p -> System.out.println(p.getValue().customerId + " " + p.getValue().customerName));
	}

}
