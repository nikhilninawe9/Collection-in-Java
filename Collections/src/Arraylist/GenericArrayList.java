package Arraylist;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(52);
		markList.add(123);
		markList.add(123);
		markList.add(53212);
		markList.add(5232);
		ArrayList<Double> markList2 = new ArrayList<Double>();
		markList2.add(100.0);
		markList2.add(300.0);
		markList2.add(32.0);
		markList2.add(11.0);
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("anshu");
		studentNames.add("nikku");
		studentNames.add("raju");
		System.out.println(studentNames);
		System.out.println(markList);
		System.out.println(markList2);

	}

}
