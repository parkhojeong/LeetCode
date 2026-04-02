class Solution {
    public int minimumCost(int[] nums) {
        int[] subarray = Arrays.copyOfRange(nums, 1, nums.length);
        Arrays.sort(subarray);
        return nums[0] + subarray[0] + subarray[1];
    }
}