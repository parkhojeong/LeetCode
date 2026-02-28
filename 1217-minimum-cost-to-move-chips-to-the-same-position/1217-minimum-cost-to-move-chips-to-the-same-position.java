class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for(int i: position) {
            if(i % 2 == 0){
                even += 1;
            } else{
                odd += 1;
            }
        }
        if(odd == 0 || even == 0){
            return 0;
        }

        return Math.min(odd,even);
    }
}