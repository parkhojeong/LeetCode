class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }

        numSet.remove(0);
        return numSet.size();
    }
}