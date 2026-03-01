class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] output = new int[queries.length];
        Arrays.sort(nums);
        
        for(int i = 0; i < queries.length; i++){
            int sum = 0;
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] + sum > queries[i]){
                    break;
                } else {
                    sum += nums[j];
                    count += 1;
                }
            }
            output[i] = count;
        }

        return output;
    }
}