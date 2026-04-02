class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1; i <= n-1; i++) {
            for(int j = i+1; j<= n-1; j++) {
                int powSum = i*i + j*j;
                if(powSum > n*n) break;

                Double sqrt = Math.sqrt(powSum);

                if(sqrt == sqrt.intValue()) {
                    count++;
                }
            }
        }

        return count*2;
    }
}
// c = root(a^2 + b^2) 