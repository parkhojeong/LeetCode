class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        int sum1 = 0;
        for(int i = 1; i < arr.length - 1; i++){
            sum1 += arr[i-1];
            int sum2 = arr[i];

            if((sum1 * 3) != sum){
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if((sum2 * 3) == sum){
                    return true;
                }

                sum2 += arr[j];
            }
        }

        return false;
    }
}