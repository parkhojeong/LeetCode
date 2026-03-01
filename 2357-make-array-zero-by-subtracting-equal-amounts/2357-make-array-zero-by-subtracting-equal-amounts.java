class Solution {
    public int minimumOperations(int[] nums) {
        int output = 0;
        while(true) {
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
            if(sum == 0){
                break;
            }

            int min = Integer.MAX_VALUE;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > 0 && nums[i] < min){
                    min = nums[i];
                }
            }

            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[i] -= min;
                }
            }

            output += 1;
        }

        return output;
    }
}