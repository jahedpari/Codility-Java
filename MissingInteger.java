
/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

https://app.codility.com/demo/results/training3YXGXQ-SHG/
*/

	// ***** Detected time complexity: O(N)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%



import java.util.*;

 
class Solution {
 	public int solution(int[] A) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0)
				set.add(A[i]);
		}
		List<Integer> list = new ArrayList<Integer>(set); // set -> list
		Collections.sort(list); // Sort the list

		if (list.size() < 1)
			return 1;

		for (int i = 0; i < list.size(); i++) {
			int value = i + 1;
			if (list.get(i) != value)
				return value;
		}

		// if the missing value was not between the number, then it will be at the end
		int max = list.get(list.size() - 1) + 1;

		return max;
	}
}