/*
An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.

For example, consider array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.

For example, given array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
the function may return 0, 2, 4, 6 or 7, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

https://app.codility.com/demo/results/training5RNFYQ-6U7/

*/

	// ***** Detected time complexity: O(N)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%



import java.util.*;



class Solution {
	public int solution(int[] A) {

		int len = A.length;

		if (len == 0)
			return -1;

		// To keep original index
		int[] B = A.clone();

		Arrays.sort(A);

		int mid = A[len / 2];
		int counter = 0;

		for (int i = 0; i < len; i++) {

			if (A[i] == mid)
				counter++;

		}

		int ans = -1;

		// find index of leader in original array
		if (counter > (len / 2)) {
			for (int i = 0; i < len / 2 + 1; i++)
				if (mid == B[i]) {
					ans = i;
					break;
				}
		}

		return ans;
	}
}