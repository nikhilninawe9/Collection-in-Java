package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("devops");
		System.out.println(ar1);

//		// addAll
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);// [java, python, testing, devops, ruby, javascript]
//
//		// clear
//		ar1.clear();
//		System.out.println(ar1);// []

		// clone
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);// [java, python, ruby, javascript]

		// contains
		System.out.println(ar1.contains("ruby"));// true

		// indexOf
		System.out.println(ar1.indexOf("javascript") > 2);// true
		System.out.println(ar1.indexOf("ruby"));// 2

		// lastIndexOf
		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("nikhil", "ansh", "nikhil", "bunty", "swapnya", "nikhil"));
		System.out.println(list1);// [nikhil, ansh, nikhil, bunty, swapnya, nikhil]

		int a = list1.lastIndexOf("nikhil");
		System.out.println(a);// 5

		// remove
		list1.remove(3);
		System.out.println(list1);// [nikhil, ansh, nikhil, swapnya, nikhil]

		// removeIf (remove when any conditions)
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(32, 656, 98, 55, 9));
//		numbers.removeIf(num -> num % 2 == 0);
//		System.out.println(numbers);// [55, 9] removed all even numbers
		numbers.removeIf(num -> num % 2 != 0);
		System.out.println(numbers);// [32, 656, 98] removed all odd numbers

		// retain all
		ArrayList<String> namesList = new ArrayList<String>(
				Arrays.asList("nikhil", "ansh", "Tom", "bunty", "swapnya", "nikhil"));
		System.out.println(namesList);
		namesList.retainAll(Collections.singleton("nikhil"));
		System.out.println(namesList);// [nikhil, nikhil]

		// sublist
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(sublist);// [3, 4, 5, 6]

		// convert arraylist into array
		ArrayList<String> namesList2 = new ArrayList<String>(
				Arrays.asList("nikhil", "ansh", "Tom", "bunty", "swapnya", "robert"));
		Object arr[] = namesList2.toArray();
		System.out.println(Arrays.toString(arr));// [nikhil, ansh, Tom, bunty, swapnya, robert]
		System.out.println("==========================================================");

		for (Object o : arr) {
			System.out.println((String) o);
		}

	}

}
