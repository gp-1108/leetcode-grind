/*
  Author: gp-1108
  Time: O(n)
  Space: O(1)
  Score: 100%, 44.97%
*/

public class Solution {
  public static int removeElement(int[] nums, int val) {
    int k = 0;
        while(k < nums.length && nums[k] != val) {
            k++;
        }
        int i = k+1;
        while(i < nums.length) {
            if(nums[i] == val) {
                i++;
                continue;
            }
            nums[k] = nums[i];
            i++;
            k++;
        }
        return k;
  }
}