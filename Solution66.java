/**
 * Author: gp-1108
 * Time: O(n)
 * Space: O(n)
 * Score: 100%, 5.69%
 */
class Solution {
  public int[] plusOne(int[] digits) {
      if(add(digits, digits.length-1)) {
        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        for(int i = 1; i < temp.length; i++) {
          temp[i] = digits[i-1];
        }
        return temp;
      }
    return digits;
  }
  
  private boolean add(int[] number, int position) {
    if(position < 0) return true;
    if(number[position] < 9) {
      number[position] += 1;
      return false;
    }
    number[position] = 0;
    return add(number, position-1);
  }
}
