class Solution {
    public int minTimeToType(String word) {
        int output = 0;
        int prev = Character.getNumericValue('a');
        int cur = 0;
        int diff = 0;
        for(int i = 0; i < word.length(); i++){
            cur = Character.getNumericValue(word.charAt(i));
            
            diff = Math.abs(prev - cur);
            output += Math.min(26 - diff, diff);
            output += 1;

            prev = cur;
        }

        return output;
    }
}