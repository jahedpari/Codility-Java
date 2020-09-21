/*
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".


https://app.codility.com/demo/results/trainingDAK6TU-UD2/

*/

	// ***** Detected time complexity: O(N)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%


import java.util.*;
 

class Solution {
public int solution(String S) {

		int N = S.length();

		if (N == 0)
			return 1;
		if (N % 2 != 0)
			return 0;

		char opened[] = { '{', '[', '(' };
		char closed[] = { '}', ']', ')' };

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < N; i++) {

			char c = S.charAt(i);
			if (bracketindex(c, opened) >= 0)
				stack.push(c);
			else if (stack.size() == 0)
				return 0;
			else if (bracketindex(c, closed) == -1)
				return 0;
			else {
				int index = bracketindex(c, closed);
				char top = stack.pop();
				if (bracketindex(top, opened) != index)
					return 0;
			}
		}

		if (stack.size() != 0)
			return 0;
		return 1;

	}

	public int bracketindex(char c, char brackets[]) {
		for (int i = 0; i < brackets.length; i++)
			if (c == brackets[i])
				return i;

		return -1;
	}
}