package com.eric.algorithm.ch1;

import java.io.File;
import java.util.Arrays;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearchLoopImpl {

	public static int binarySearch(int key, int[] array) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (key > array[mid])
				lo = mid + 1;
			else if (key < array[mid])
				hi = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whiteList = new In(new File("tinyW.txt")).readAllInts();
		int[] checkList = new In(new File("tinyT.txt")).readAllInts();
		Arrays.sort(whiteList);
		for (int i = 0; i < checkList.length; i++) {
			int key = checkList[i];
			if (binarySearch(key, whiteList) < 0) {
				StdOut.println(key);
			}
		}
	}
}
