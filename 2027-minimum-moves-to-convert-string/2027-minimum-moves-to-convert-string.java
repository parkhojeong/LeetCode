class Solution {
    public int minimumMoves(String s) {
        int i = 0;
        int output = 0;
        while(i < s.length()) {
            if(s.charAt(i) == 'X'){
                i += 3;
                output += 1;
            } else {
                i += 1;
            }
        }

        return output;
    }
}