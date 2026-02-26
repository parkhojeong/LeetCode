class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] flowerbed2 = new int[flowerbed.length + 2];
        System.arraycopy(flowerbed, 0, flowerbed2, 1, flowerbed.length);
        
        int i = 1;
        while(i < flowerbed2.length - 1 && n > 0){
            if(flowerbed2[i] == 0
                && (flowerbed2[i-1] + flowerbed2[i+1]) == 0
            ){
                n -= 1;
                flowerbed2[i] = 1;
            }
            i++;
        }

        return n > 0 ? false : true;
    }
}