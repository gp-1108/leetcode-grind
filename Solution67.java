/**
 * Author: Hi-Malik
 * Time: O(max(len a, len b))
 * Space: O(len a + len b)
 * Score: 69%, 16%
 */
class Solution {
    public String addBinary(String a, String b) {
        
        int j = a.length() - 1;
        int i = b.length() - 1;
        int of = 0;
        StringBuilder result = new StringBuilder();
        
        while(i >= 0 || j >= 0) {
            int sum = of;
            if(i >= 0) sum += b.charAt(i--) - '0';
            if(j >= 0) sum += a.charAt(j--) - '0';
            
            result.append(sum % 2);
            of = sum > 1 ? 1 : 0;
        }
        if(of == 1) result.append(1);
        return result.reverse().toString();
    }
}