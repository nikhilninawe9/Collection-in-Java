package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConvertHashMapToArrayList6 {

	public static void main(String[] args) {

		// Convert HashMap into Arraylist
		HashMap<String, Integer> cryptoMap = new HashMap<>();
		cryptoMap.put("Bitcoin", 29000);
		cryptoMap.put("Dogecoin", 30);
		cryptoMap.put("Polkadot", 2200);
		cryptoMap.put("Bitcoin Cash", 55000);

		// with Lambda Function
		cryptoMap.forEach((k, v) -> System.out.println("Keys are: " + k + " Values are: " + v));

		System.out.println("================================");

		System.out.println("Cryptocurrency Map size is " + cryptoMap.size());
		Iterator it1 = cryptoMap.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pairs = (Entry) it1.next();
			System.out.println(pairs.getKey() + " : " + pairs.getValue());
		}
		System.out.println("================================");

		// convert hashmap into arraylist
		// for keys
		List<String> cryptoNames = new ArrayList<>(cryptoMap.keySet());
		System.out.println("Total Cryptocurrencies are: " + cryptoNames.size());
		for (String names : cryptoNames) {
			System.out.println(names);
		}

		System.out.println("================================");

		List<Integer> cryptoValue = new ArrayList<>(cryptoMap.values());
		System.out.println("Total Rate are: " + cryptoValue.size());
		for (Integer values : cryptoValue) {
			System.out.println(values);
		}
		System.out.println("================================");
	}

}
