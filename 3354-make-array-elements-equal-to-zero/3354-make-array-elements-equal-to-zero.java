class Solution {
    public int countValidSelections(int[] nums) {
        if(nums.length == 1 && nums[0] == 0) return 2;

        int n = nums.length;
        int[] leftSum = new int[n];
        leftSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            leftSum[i] = nums[i] + leftSum[i-1];
        }

        int[] rightSum = new int[n];
        rightSum[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            rightSum[i] = nums[i] + rightSum[i+1];
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0 ){
                if(i == 0) {
                    if(rightSum[i+1] == 1) count++;
                    else if(rightSum[i+1] == 0) count+=2;
                } else if (i == n-1) {
                    if(leftSum[i-1] == 1) count++;
                    else if(leftSum[i-1] == 0) count+=2;
                }else {
                    int diff = Math.abs(leftSum[i-1]-rightSum[i+1]);
                    if(diff == 1) count+=1;
                    else if(diff == 0) count+=2;
                }
                
            }
        }

        return count;
    }
}