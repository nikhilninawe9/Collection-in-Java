package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasics {

	// LinkedList is default class in java
	// It can be used as List,Stack,Queue
	// It allows the null entry
	// dynamic collection= hence insertion and deletion can be easily implemented
	// It can contain duplicate element
	// it is not synchronised (not thread safe)
	// In linked list data manipulation is fast as compared to array because we dont
	// need any shifting as it works on data-pointer(address) principal.

	// LinkedList Constructors:
	// 1. LinkedList()
	// 2. LinkedList(Collection c)

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		System.out.println(names.size());
		names.add("Tom");
		names.add("Ansh");
		names.add("Lisa");
		names.add("Dolu");
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(1));

		// Iterate
		Iterator it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============================");

		// to add element at particular (2) index
		names.add(2, "Chotu");
		Iterator it1 = names.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		// and new linkedlist to existing linked list
		LinkedList<String> users = new LinkedList<>();
		users.add("Naresh");
		users.add("Ganesh");

		names.addAll(users);

		System.out.println(names);// [Tom, Ansh, Chotu, Lisa, Dolu, Naresh, Ganesh]

		// different methods
		names.addFirst("Kamala");
		System.out.println(names);// [Kamala, Tom, Ansh, Chotu, Lisa, Dolu, Naresh, Ganesh]
		names.addLast("xxxxx");
		System.out.println(names);// [Kamala, Tom, Ansh, Chotu, Lisa, Dolu, Naresh, Ganesh, xxxxx]
		names.remove(8);
		System.out.println(names);// [Kamala, Tom, Ansh, Chotu, Lisa, Dolu, Naresh, Ganesh]
		// [removeAll.removeFirst,removeLast() are also there]

		// removeAll= fro removing 1 linkedlist which is added separately.
		// ex. removing users from names
		names.removeAll(users);
		System.out.println(names);// [Kamala, Tom, Ansh, Chotu, Lisa, Dolu]

		LinkedList<String> lang = new LinkedList<>();
		lang.add("Java");
		lang.add("Ruby");
		lang.add("C#");
		lang.add("Python");
		System.out.println(lang.size());

		// Reverse the linked list
		Iterator it2 = lang.descendingIterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		} // it will type in reverse descending order.

		for (String x : lang) {
			System.out.println(x);
		}

		// Data sorting: BY Collections class
		Collections.sort(lang);
		System.out.println(lang);// [C#, Java, Python, Ruby] ascending order sorting order

	}

}
