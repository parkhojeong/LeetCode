class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        
        if(n == 0) return arr;
        arr[1] = 1;

        int m = 1;
        for(int i = 2; i <= n; i++) {
            if(m * 2 == i){
                m = i;
                arr[i] = 1;
            } else {
                arr[i] = arr[m] + arr[i - m];
            }
        }
        
        return arr;
    }
}
// 0 1 1 
// 2 1 
// 2 2 3 1 
// 2 2 3 2 3 3 4 1

//   0 0
//   0 1
//   1 0
//   1 1 
// 1 0 0 
// 1 0 1 
// 1 1 0
// 1 1 1 