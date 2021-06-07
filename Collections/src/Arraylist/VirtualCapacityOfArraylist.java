package Arraylist;

import java.util.ArrayList;

public class VirtualCapacityOfArraylist {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		// By default arraylist capacity is 10.
		System.out.println(ar.size());// physical capacity is 0

		ar.add(100);
		ar.add(323);

		System.out.println(ar.size());// physical capacity is 2

		ar.add(5656);
		ar.add(989);
		ar.add(87);

		System.out.println(ar.size());
	}

}
