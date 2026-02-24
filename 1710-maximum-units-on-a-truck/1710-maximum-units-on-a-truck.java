class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int sum = 0;
        int left = truckSize;


        for (int[] boxType : boxTypes) {
            int box = boxType[0];
            int unit = boxType[1];
            while (left > 0) {
                box -= 1;
                left -= 1;
                sum += unit;

                if (box == 0) {
                    break;
                }
            }
            
        }
        
        return sum;
    }
}