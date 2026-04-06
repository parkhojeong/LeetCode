
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < k; i++){ 
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] output = new int[nums.length - k + 1];
        for(int i = 0; i <= nums.length - k; i++){

            int result = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
                    .thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
                .limit(x)
                .mapToInt(e -> e.getKey() * e.getValue())
                .sum();

            output[i] = result;

            if(i == nums.length - k) break;
            map.put(nums[i], map.get(nums[i])-1);
            map.put(nums[i+k], map.getOrDefault(nums[i+k], 0) + 1);
        }
        

        return output;
    }
}