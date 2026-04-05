class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i = 1; i < points.length; i++) {
            int[] p1 = points[i-1];
            int[] p2 = points[i];
            sum += Math.max(Math.abs(p1[0]-p2[0]), Math.abs(p1[1]-p2[1]));
        }

        return sum;
    }
}