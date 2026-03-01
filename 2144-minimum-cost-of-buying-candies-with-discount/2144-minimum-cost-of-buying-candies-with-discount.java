class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int i = cost.length - 1;

        int count = 0;
        int output = 0;
        while (i >= 0) {
            count += 1;
            output += cost[i];

            if(count == 2){
                i--;
                count = 0;
            }
            i--;
        }

        return output;
    }
}