/*
  Author: gp-1108
  Time: O(mn)
  Space: O(1)
  Score: 92.96%, 39.11%
  N.B. m = needle length, n = haystack length
*/
class Solution {
  public static int strStr(String haystack, String needle) {
    if(needle.equals("") && haystack.equals("")) return 0;
      if(needle.length() > haystack.length()) return -1;
      
      for(int i = 0; i < haystack.length(); i++) {
        int hayLeft = i;
        int hayRight = i + needle.length() - 1;
        int needleLeft = 0;
        int needleRight = needle.length() - 1;
        if(hayRight >= haystack.length()) return -1;
        
        while(hayLeft <= hayRight && needleLeft <= needleRight) {
          boolean isValid = needle.charAt(needleLeft) == haystack.charAt(hayLeft) && needle.charAt(needleRight) == haystack.charAt(hayRight);
          if(!isValid) break;
          needleLeft++;
          needleRight--;
          hayLeft++;
          hayRight--;
        }
        
        if(needleLeft > needleRight) return i;
      }
      return -1;
  }

}