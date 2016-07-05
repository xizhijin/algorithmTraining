package com.eric.algorithm.ch1;

public class BinarySearchRecursiveImpl {

	public static void main(String[] args) {
		int[] array = {1, 3, 4, 5, 7, 8};
		int key =4;
		System.out.println(binarySearch(key, array));
	}

	private static int binarySearch(int key, int[] array) {
		return recursiveSearch(key, array, 0, array.length - 1);
	}

	private static int recursiveSearch(int key, int[] array, int lo, int hi) {
		int mid = (lo + hi) / 2;
		if (lo > hi) {
			return -1;
		} else if (key < array[mid]) {
			recursiveSearch(key, array, lo, mid - 1);
		} else if (key > array[mid]) {
			recursiveSearch(key, array, mid + 1, hi);
		} else return mid;
		return -1;
	}

}
