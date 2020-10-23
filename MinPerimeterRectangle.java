/*


An integer N is given, representing the area of some rectangle.

The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).

The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.

For example, given integer N = 30, rectangles of area 30 are:

(1, 30), with a perimeter of 62,
(2, 15), with a perimeter of 34,
(3, 10), with a perimeter of 26,
(5, 6), with a perimeter of 22.
Write a function:

class Solution { public int solution(int N); }

that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.

For example, given an integer N = 30, the function should return 22, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..1,000,000,000].


https://app.codility.com/demo/results/trainingJUPPK2-UT4/

*/

	// ***** Detected time complexity: O(N)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%


class Solution {
	public int solution(int N) {

		// find divisor of N
		int divisor = 1;
		int perimeter;
		int minPerimeter = Integer.MAX_VALUE;
		for (int factor = 1; factor <= N / factor; factor++) {
			if (N % factor == 0) {
				divisor = N / factor;

				perimeter = 2 * (divisor + factor);
				minPerimeter = Math.min(perimeter, minPerimeter);

			}

		}

		return minPerimeter;

	}
}