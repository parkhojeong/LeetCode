class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        for(int i = 1; i < arr.length - 1; i++){     
            sum1 += arr[i-1];
            sum2 = arr[i];

            if((sum1 * 3) != totalSum){
                continue;
            }
            
            for (int j = i + 1; j < arr.length; j++) {
                if((sum2 * 3) == totalSum){
                    return true;
                }

                sum2 += arr[j];
            }
        }

        return false;
    }
}