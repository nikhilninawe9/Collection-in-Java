package MapByR;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ProductExecution {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> l = new LinkedHashMap<>();
		l.put(111, new Product(111, "IPhone 13", 75000.00));
		l.put(222, new Product(222, "Macbook Pro", 100000.00));
		l.put(333, new Product(333, "Glenfiddich", 16000.20));

		Set<Entry<Integer, Product>> products = l.entrySet();
		Iterator<Entry<Integer, Product>> product = products.iterator();
		while (product.hasNext()) {
			Entry<Integer, Product> e = product.next();
			if (e.getKey() == 222) {
				product.remove();
			}
		}
		l.entrySet().forEach(p -> System.out
				.println("Product [" + p.getValue().pId + " " + p.getValue().pName + " " + p.getValue().pCost + "]"));
	}
}
