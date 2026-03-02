class Solution {
    public int maximizeSum(int[] nums, int k) {
        int output = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }

        for(int i = 0; i < k; i++){
            output += max;
            max += 1;
        }

        return output;
    }
}