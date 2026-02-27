class Solution {
    public int[] diStringMatch(String s) {
        int[] output = new int[s.length()+1];

        int min = 0;
        int max = output.length - 1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                output[i] = min;
                min += 1;
            } else {
                output[i] = max;
                max -= 1;
            }
        }
        
        if(s.charAt(s.length()-1) == 'I') {
            output[s.length()] = min;
        } else{
            output[s.length()] = max;
        }

        return output;
    }
}