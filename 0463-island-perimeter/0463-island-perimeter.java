class Solution {
    public int islandPerimeter(int[][] grid) {
        return bfs(grid);
        // return useDfs(grid);
    }

    int bfs(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int[] start = new int[2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    start[0] = i;
                    start[1] = j;
                    break;
                }
            }
        }
        q.add(start);
        int sum = 0;
        while(!q.isEmpty()) {
            int[] cell = q.poll();
            int i = cell[0];
            int j = cell[1];

            if(grid[i][j] != 1) continue;
            grid[i][j] = -1;

            if(i == 0) sum += 1;
            if(j == 0) sum += 1;
            if(i == grid.length -1) sum += 1;
            if(j == grid[0].length - 1) sum += 1;

            if(i > 0                && grid[i-1][j] == 0) sum += 1;
            if(j > 0                && grid[i][j-1] == 0) sum += 1;
            if(i < grid.length-1    && grid[i+1][j] == 0) sum += 1;
            if(j < grid[0].length-1 && grid[i][j+1] == 0) sum += 1;

            if(i > 0                && grid[i-1][j] == 1) q.add(new int[]{i-1, j});
            if(j > 0                && grid[i][j-1] == 1) q.add(new int[]{i, j-1});
            if(i < grid.length-1    && grid[i+1][j] == 1) q.add(new int[]{i+1, j});
            if(j < grid[0].length-1 && grid[i][j+1] == 1) q.add(new int[]{i, j+1});                    
        }

        return sum;
    }

    int useDfs(int[][] grid) {
        int output = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    return dfs(grid, i, j);
                    
                }
            }
        }

        return output;
    }

    private int dfs(int[][] grid, int i, int j){
        int sum = 0;
        grid[i][j] = -1;
        
        // north
        if(i == 0 || grid[i-1][j] == 0){
            sum += 1;
        }

        // west
        if(j == 0 || grid[i][j-1] == 0){
            sum += 1;
        }

        // east
        if(j == grid[i].length - 1 || grid[i][j+1] == 0){
            sum += 1;
        }

        // south
        if(i == grid.length - 1 || grid[i+1][j] == 0){
            sum += 1;
        }

        // north
        if(i > 0 && grid[i-1][j] == 1){
            sum += dfs(grid, i-1, j);
        }

        // west
        if(j > 0 && grid[i][j-1] == 1){
            sum += dfs(grid, i, j-1);
        }

        // south
        if(i < grid.length - 1 && grid[i+1][j] == 1){
            sum += dfs(grid, i+1, j);
        }

        // east
        if(j < grid[0].length - 1 && grid[i][j+1] == 1){
            sum += dfs(grid, i, j+1);
        }
        
        return sum;
    }
}