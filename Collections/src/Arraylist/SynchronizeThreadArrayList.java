package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeThreadArrayList {

	public static void main(String[] args) {
		// 1.Collections.synchronizedList
		// by default arraylist is not thread safe. to make it thread safe.
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");

		// add,remove we dont need explicit synchronization
		// to fetch/traverse the values from this list -- we have to use explicit
		// synchronization
		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		System.out.println("--------------------------------------------------------------");
		// 2. copyOnWriteArrayList -- its a class: Thread safe/synchronized already.
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Naveen");
		// we dont need explicit synchronization for any operation: add/remove/traverse
		Iterator<String> it1 = empList.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
