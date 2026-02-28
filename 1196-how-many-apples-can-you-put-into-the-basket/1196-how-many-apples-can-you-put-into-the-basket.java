class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int sum = 0;
        int i = 0;
        while(i < weight.length) {
            if(sum + weight[i] > 5000){
                break;
            }

            sum += weight[i];
            i += 1;
        }

        return i;
    }
}