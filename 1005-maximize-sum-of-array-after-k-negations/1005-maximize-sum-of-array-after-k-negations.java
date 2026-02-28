class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(k == 0){
                break;
            }

            if(nums[i] < 0) {
                nums[i] *= -1;
                k -= 1;

                if(k > 0 && i == nums.length -1){
                    nums[i] *= -1;
                    break;
                }
            } else {
                if(k % 2 == 0){
                    k = 0;
                    break;
                }
                
                if(i >= 1 && nums[i-1] < nums[i]){
                    nums[i-1] *= -1;
                } else {
                    nums[i] *= -1;
                }
                k = 0;
                break;
            }
        }

        
        // System.out.println(Arrays.toString(nums));
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }

        return sum;
    }
}