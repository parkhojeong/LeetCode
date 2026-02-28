class Solution {
    public int[] largestSubarray(int[] nums, int k) {
        List<Integer> ints = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            ints.add(nums[i]);
        }
        
        List<Integer> newInts = new ArrayList<>(ints);
        for(int i = 1; i <= nums.length-k; i++){
            newInts.removeFirst();
            newInts.addLast(nums[i+k-1]);
            
            if(compare(ints, newInts, k) < 0) {
                ints = new ArrayList<>(newInts);
            }
        }    
        
        return ints.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
    }

    public int compare(List<Integer> ints1, List<Integer> ints2, int k) {
        for(int i = 0; i < k; i++){
            if(ints1.get(i) < ints2.get(i)){
                return -1;
            } else if(ints1.get(i) > ints2.get(i)){
                return 1;
            }
        }
        return 1;
    }
}