package com;
import java.util.ArrayList;
import java.util.Iterator;
public class LongestIncreasingSubsequence {
    
	public static void main(String[] args) {
		int array[] = { 10, 86, 45, 52, 99, 100, 70, 1, 120 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> longestList = new ArrayList<Integer>();
		int currentMax;
		int highestCount = 0;
		System.out.println("Array Values:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			currentMax = Integer.MIN_VALUE;
			for (int j = i; j < array.length; j++) {
				if (array[j] > currentMax) {
					list.add(array[j]);
					currentMax = array[j];
				}
			}

			if (highestCount < list.size()) {
				highestCount = list.size();
				longestList = new ArrayList<Integer>(list);
			}
			list.clear();
		}
		System.out.println();

		Iterator<Integer> itr = longestList.iterator();
		System.out.println("The Founded Longest subsequence");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("Length of LIS: " + highestCount);

	}

}
