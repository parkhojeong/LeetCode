class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIdx = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            numToIdx.put(nums[i], i); // if present, overwrite
        }

        for(int i = 0; i < nums.length; i++){
            Integer idx = numToIdx.get(target - nums[i]);
        
            if(idx != null && idx != i){
                return new int[]{i, idx};
            }
        }

        return new int[]{0,0}; // only to prevent compile error
    }
}