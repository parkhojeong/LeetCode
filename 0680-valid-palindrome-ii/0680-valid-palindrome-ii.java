
import java.util.Dictionary;class Solution {
    public boolean validPalindrome(String s) {
        int leftIdx = 0;
        int rightIdx = s.length() - 1;

        while (leftIdx < rightIdx) {
            if (s.charAt(leftIdx) == s.charAt(rightIdx)){
                leftIdx += 1;
                rightIdx -= 1;
            } else {
                String s1 = s.substring(leftIdx, rightIdx);
                String reversedS1 = new StringBuilder(s1).reverse().toString();
                if(s1.equals(reversedS1)){
                    return true;
                }

                String s2 = s.substring(leftIdx+1, rightIdx+1);
                String rs2 = new StringBuilder(s2).reverse().toString();
                if(s2.equals(rs2)){
                    return true;
                }

                return false;
            }
        }

        return true;
    }
}