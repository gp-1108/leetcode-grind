/**
 * Author: gp-1108
 * Time: O(log n)
 * Space: O(log n)
 * Score: 100%, 41.21%
 */
public class Solution {
  public int searchInsert(int[] nums, int target) {
    if(nums.length <= 0) return 0;
    return binSearch(nums, target, 0, nums.length-1);
  }
    
  private int binSearch(int[] nums, int target, int left, int right) {
    int mid = (left+right)/2;
    
    if(nums[mid] == target) return mid;
    
    if(left >= right && nums[left] > target) return left;
    if(left >= right && nums[left] < target) return left+1;
    
    if(nums[mid] > target) {
      return binSearch(nums, target, left, mid-1);
    } else {
      return binSearch(nums, target, mid+1, right);
    }
  }
}
