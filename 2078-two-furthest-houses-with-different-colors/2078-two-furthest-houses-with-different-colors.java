class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for(int i = 0; i < colors.length; i++){
            int color1 = colors[i];
            for(int j = i+1; j < colors.length; j++) {
                int color2 = colors[j];
                
                if(color1 != color2){
                    int diff = Math.abs(i - j);
                    max = Math.max(max, diff);
                }
            }
        }

        return max;
    }
}