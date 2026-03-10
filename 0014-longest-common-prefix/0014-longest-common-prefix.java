class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";

        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            minLen = Math.min(strs[i].length(), minLen);
        }

        for(int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(ch != strs[j].charAt(i)) return str;
            }

            str += ch;
        }

        return str;
    }
}