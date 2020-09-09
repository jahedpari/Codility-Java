/*
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].

*/

	// ***** Detected time complexity: O(N)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%


import java.util.*;

 

class Solution {
 	public int solution(int[] A) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}

		// if there is duplicate, return false
		if (set.size() != A.length)
			return 0;

		List<Integer> list = new ArrayList<Integer>(set); // set-> list
		Collections.sort(list); // Sort the list

		for (int i = 0; i < list.size(); i++) {
			int value = i + 1;
			if (list.get(i) != value)
				return 0;
		}

		return 1;
    }
}