/*
A string S consisting of N characters is called properly nested if:

S is empty;
S has the form "(U)" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, string "(()(())())" is properly nested but string "())" isn't.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..1,000,000];
string S consists only of the characters "(" and/or ")".


https://app.codility.com/demo/results/training2AR5BA-27B/

*/

	// ***** Detected time complexity: O(N)
	// ***** Correctness: 100%
	// ***** Performance: 100%
	// ***** Task Score: 100%


import java.util.*;

 
class Solution {
public int solution(String S) {
 

		if (S.length() == 0)
			return 1;
		if (S.length() % 2 != 0)
			return 0;

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++)

		{

	 
			char elem = S.charAt(i);

			if (elem == ')') {
				if (stack.size() == 0)
					return 0;
				if (stack.peek() == '(')
					stack.pop();
				else
					return 0;

			}

			else if (elem == '(')
				stack.push(elem);
			else
				return 0;

		}

		if (stack.size() != 0)
			return 0;

		return 1;

	}

}