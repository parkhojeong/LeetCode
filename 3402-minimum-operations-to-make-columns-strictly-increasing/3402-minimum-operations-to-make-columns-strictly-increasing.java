class Solution {
    public int minimumOperations(int[][] grid) {
        int output = 0;

        for(int i = 0; i < grid[0].length; i++){
            int prev = grid[0][i];

            for(int j = 1; j < grid.length; j++){
                int val = grid[j][i];

                if(prev >= val){
                    int increasedVal = prev+1;
                    output += increasedVal-val;
                    prev = increasedVal;
                } else { 
                    prev = val;
                }
            }
        }

        return output;

    }
}