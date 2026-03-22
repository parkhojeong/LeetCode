class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k == 1) {
            return true;
        }

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i-1) >= nums.get(i)){
                arr.add(i);
            }
        }

        for(int i = 0; i < arr.size(); i++){
            int i1 = arr.get(i);
            int i2 = i+1 >= arr.size() ? nums.size() : arr.get(i+1);
            if(i2 - i1 >= 2 *k) return true;
        }

        for(int i = 0; i < arr.size()-1; i++) {
            int i1 = arr.get(i);
            int i2 = arr.get(i+1);
            int i3 = i+2 >= arr.size() ? nums.size() : arr.get(i+2);
            if(i2 - i1 >= 2 *k) return true;
            if((i2 - i1 >= k) && (i3 - i2 >= k)) return true;
        }

        return false;
    }
}