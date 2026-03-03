class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        
        if(nums[nums.length-1] <= 0){
            return nums[nums.length-1];
        }

        Set<Integer> addedNum = new HashSet<>();
        int output = 0;
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] < 0){
                break;
            }

            if(addedNum.contains(nums[i])){
                continue;
            }

            output += nums[i];
            addedNum.add(nums[i]);
        }

        return output;
    }
}