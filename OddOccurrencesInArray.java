
//*****	 Detected time complexity: O(N)
//*****	 Correctness: 100%
//*****	 Performance: 100%
//*****	 Task Score:  100%		
//https://app.codility.com/demo/results/trainingXZNJQ3-ZGA/

 import java.util.*;

 
class Solution {
    public int solution(int[] A) {
        {

		if (A.length == 1)
			return A[0];

		Set<Integer> hset = new HashSet<Integer>();

		for (int elem : A) {
			if (hset.contains(elem))
				hset.remove(elem);
			else
				hset.add(elem);
		}

		for (Integer ans : hset)
			return ans;

		return -1;

	}
    }
}