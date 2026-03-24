class Solution {
    public boolean isTrionic(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        boolean startIncrease = false;
        boolean startSame = false;
        boolean startDecrease = false;
        for(int i = 1; i < nums.length; i++){

            boolean isIncresed = nums[i-1] < nums[i];
            boolean isSame = nums[i-1] == nums[i];
            boolean isDecresed = nums[i-1] > nums[i];

            if(isSame) {
                if(!startSame) {
                    arr.add(0);
                    startSame = true;
                }
                if(startIncrease) startIncrease = false;
                if(startDecrease) startDecrease = false;
            }

            if(isIncresed) {
                if(!startIncrease) {
                    arr.add(1);
                    startIncrease = true;
                }
                if(startSame) startSame = false;
                if(startDecrease) startDecrease = false;
            }

            if(isDecresed) {
                if(!startDecrease) {
                    arr.add(-1);
                    startDecrease = true;
                }
                if(startIncrease) startIncrease = false;
                if(startSame) startSame = false;
            }
        }

        if(arr.size() != 3) return false;
        return arr.get(0) == 1 && arr.get(1) == -1 && arr.get(2) == 1;
    }
}