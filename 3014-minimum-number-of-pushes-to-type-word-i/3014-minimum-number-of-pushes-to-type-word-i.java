class Solution {
    public int minimumPushes(String word) {
        int output = 0; 

        for(int i = 0; i < word.length(); i++){
            output += (i / 8) + 1;
        }
        return output;
    }
}