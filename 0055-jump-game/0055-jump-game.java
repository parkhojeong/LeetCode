class Solution {
    public boolean canJump(int[] nums) {
        int cur = 0;
        for(int i = 0; i < nums.length; i++) {
            if(cur >= i && nums[i] + i > cur) cur = nums[i] + i;
        }

        return cur >= nums.length-1;

        // int[] arr = new int[nums.length];
        // arr[0] = 1;
        // for(int i = 0; i < nums.length; i++) {
        //     int num = nums[i];
        //     int j = 1;

        //     if(arr[i] == 0) break;
        //     while(j <= num && i+j < nums.length){
        //         arr[i+j] = 1;
        //         j++;
        //     }
        // }

        // return arr[nums.length-1] == 1;
    }
}