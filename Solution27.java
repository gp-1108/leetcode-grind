/*
  Author: gp-1108
  Time: O(n)
  Space: O(1)
  Score: Faster than 100%, Memory less than 44.97%
*/

public class Solution27 {
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