/**
 * Author: DavidTaylor5
 * Time: O(n)
 * Space: O(1)
 * Score: 100%, 77.81%
 */
class Solution {
  public int maxSubArray(int[] nums) {
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int element : nums) {
      currentSum += element;
      
      if(currentSum > maxSum) maxSum = currentSum;
      
      if(currentSum < 0) currentSum = 0;
    }
    return maxSum;
  }
}
