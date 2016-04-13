/* https://leetcode.com/problems/single-number/ */
package DS.Leetcode.Solutions.Medium;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		int x = 0;
		for (int a : nums) {
			x = x ^ a;
		}
		return x;
	}
	
}