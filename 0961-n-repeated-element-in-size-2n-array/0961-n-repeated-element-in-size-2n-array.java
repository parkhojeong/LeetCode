class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int count = map.getOrDefault(n, 0) + 1;
            map.put(n, count);
        }

        int n = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == n) return entry.getKey();
        }

        return -1;
    }

    
}