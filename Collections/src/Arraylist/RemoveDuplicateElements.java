package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 4, 6, 7, 8, 9, 101, 2, 5, 4, 3, 88));

		// 1 st way (Linked hashset)
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDuplicates);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 88]

		// 2 Stream:
		ArrayList<Integer> markList = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 4, 6, 7, 8, 9, 101, 2, 5, 4, 3, 88));
		List<Integer> markListUnique = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(markListUnique);
	}

}
