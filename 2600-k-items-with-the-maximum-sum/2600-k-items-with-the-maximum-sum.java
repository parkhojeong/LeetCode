class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int output = 0;

        if(k <= numOnes){
            return k;
        }
        output += numOnes;
        k -= numOnes;

        
        if(k <= numZeros){
            return output;
        }
        k -= numZeros;

        
        return output - k;
    }
}