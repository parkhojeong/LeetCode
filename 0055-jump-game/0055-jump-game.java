class Solution {
    public boolean canJump(int[] nums) {
        int cur = 0;
        for(int i = 0; i < nums.length; i++) {
            if(cur < i) return false;
            
            if(nums[i] + i > cur) cur = nums[i] + i;
        }

        return cur >= nums.length-1;
    }
}