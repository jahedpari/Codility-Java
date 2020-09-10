/*
Write a function:

class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.



https://app.codility.com/demo/results/trainingJPBUPB-QH4/

*/

	// ***** Detected time complexity: O(1)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%

class Solution {
	public int solution(int A, int B, int K) {

		int counter = 0;
		// let's Find the first divisible number and set A to that number
		for (int i = A; i <= B; i++) {
			if (i % K == 0) {
				A = i;
				counter++;
				break;

			}
		}

		int range = B - A;
        
		// how many steps of K exists in this range
		counter += range / K;

		return counter;

	}
}