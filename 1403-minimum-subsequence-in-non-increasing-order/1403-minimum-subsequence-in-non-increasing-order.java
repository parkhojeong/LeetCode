class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        
        List<Integer> output = new ArrayList<>();
        int partialSum = 0;
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 0; i--){
            partialSum += nums[i];
            output.add(nums[i]);

            if(partialSum * 2 > sum){
                break;
            }
        }

        return output;
    }
}