class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> output = new ArrayList<>();
        int curGroup = groups[0];
        output.add(words[0]);

        for(int i = 1; i < groups.length; i++){
            if(curGroup != groups[i]){
                output.add(words[i]);
                curGroup = groups[i];
            }
        }

        return output;
    }
}