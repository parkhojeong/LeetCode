class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        for(int i = 1; i < arr.length-1; i++){
            int sum1 = 0;
            for(int a = 0; a < i; a++){
                    sum1 += arr[a];
            }
            int sum2 = 0;
            for(int a = i; a < i+1; a++){
                sum2 += arr[a];
            }

            int sum3 = 0;
            for(int a = i+1; a < arr.length; a++){
                sum3 += arr[a];
            }
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.println(i + " " + j + " " + sum1 +" "+ sum2+" "+ sum3);
                if(sum1 == sum2 && sum2 == sum3){
                    return true;
                }

                sum2 += arr[j];
                sum3 -= arr[j];
            }
        }

        return false;
    }
}