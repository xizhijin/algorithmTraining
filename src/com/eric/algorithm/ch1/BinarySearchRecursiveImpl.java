package com.eric.algorithm.ch1;

public class BinarySearchRecursiveImpl {
	private static int deep = 0;

	public static void main(String[] args) {
		int[] array = {1, 3, 4, 5, 7, 8, 9, 10};
		int key =7;
		System.out.println("The index of key is: " + binarySearch(key, array));
	}

	private static int binarySearch(int key, int[] array) {
		return recursiveSearch(key, array, 0, array.length - 1);
	}

	private static int recursiveSearch(int key, int[] array, int lo, int hi) {
		System.out.println("The deep is: " + ++deep + " and lo is: " + lo + ", hi is " + hi);
		int mid = (lo + hi) / 2;
		if (lo > hi) {
			return -1;
		} else if (key < array[mid]) {
			return recursiveSearch(key, array, lo, mid - 1);
		} else if (key > array[mid]) {
			return recursiveSearch(key, array, mid + 1, hi);
		} else return mid;
	}

}
