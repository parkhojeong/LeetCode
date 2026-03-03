class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int val: apple) sum += val;

        Arrays.sort(capacity);
        int i = capacity.length - 1;
        while(i >= 0 ){
            sum -= capacity[i];

            if(sum <= 0){
                break;
            }
            i--;
        }

        return capacity.length - i;
    }
}