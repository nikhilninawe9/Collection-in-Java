package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Nikhil");
		studentList.add("Anshu");
		studentList.add("Rohini");

		// For retriving values

		// for loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		// for each loop
		for (String s : studentList) {
			System.out.println(s);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		// for each by lambda function
		studentList.stream().forEach(e -> System.out.println(e));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		// by Iterator
		Iterator it = studentList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// different ways to use arraylist
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		System.out.println(numbers);
		ArrayList<String> numbers1 = new ArrayList<String>(Arrays.asList("asd", "asd"));
		System.out.println(numbers1);
	}

}
