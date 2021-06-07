package Arraylist;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("anshu");
		ar.add(12.004);
		ar.add(false);
		System.out.println(ar);
		System.out.println("======================================");
		System.out.println("List out of arraylist below ");
		for (Object a : ar) {
			System.out.println(a);
		}
		System.out.println("======================================");

		System.out.println("Element at index 0 = " + ar.get(0));
		System.out.println("======================================");
		System.out.println("Size of arraylist is " + ar.size());// size is 6 and indexes are 5(starts with 0)
		System.out.println();
		System.out.println("Highest index is: " + (ar.size() - 1));
		System.out.println("Lowest index is: " + 0);

		ar.add(500);
		ar.add("jkdsh");
		System.out.println(ar.size());

	}

}
