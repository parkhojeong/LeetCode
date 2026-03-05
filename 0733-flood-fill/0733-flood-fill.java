class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }

        dfs(image, sr, sc, color);

        return image;
    }

    void dfs(int[][] image, int i, int j, int color) {
        int prevImage = image[i][j];
        image[i][j] = color;

        if(i > 0 && image[i-1][j] == prevImage){
            dfs(image, i-1, j, color);
        }

        if(j > 0 && image[i][j-1] == prevImage){
            dfs(image, i, j-1, color);
        }

        if(i < image.length-1 && image[i+1][j] == prevImage){
            dfs(image, i+1, j, color);
        }

        if(j < image[0].length -1 && image[i][j+1] == prevImage){
            dfs(image, i, j+1, color);
        }
    }
}