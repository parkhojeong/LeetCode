class Solution {
    public int numberCount(int a, int b) {
        int output = 0;

        for(int i = a; i <= b; i++){
            if(isUniqueDigit(i)) output += 1;
        }

        return output;
    }

    boolean isUniqueDigit(int n) {
        int[] arr = new int[11];
        
        for(String ch: Integer.toString(n).split("")){
            int digit = Integer.valueOf(ch);
            if(arr[digit] != 0) return false;

            arr[digit] = 1;
        };

        return true;
    }
}