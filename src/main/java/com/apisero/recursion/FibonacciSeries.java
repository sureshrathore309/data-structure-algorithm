package com.apisero.recursion;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println(findFab(9));
	}

	private static int findFab(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		return findFab(n - 1) + findFab(n - 2);
	}
}
