class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            int n = nums[i];
            if(n > 0){
                result[i] = nums[(i+n)% len];
            } else if (n < 0){
                result[i] = nums[(len + ((i+n) % len)) % len];
            } else {
                result[i] = n;
            }
        }

        return result;
    }
}