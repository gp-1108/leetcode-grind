/**
 * Author: gp-1108
 * Time: O(n)
 * Space: O(1)
 * Score: 100%, 24%
 */
class Solution {
  public int lengthOfLastWord(String s) {
    if(s.length() == 0) return 0;
    int i = s.length() - 1;
    int count = 0;
    while(i >= 0 && s.charAt(i) == ' ') {
      i--;
    }
    while(i >= 0 && s.charAt(i) != ' ') {
      i--;
      count++;
    }
    return count;
  }
}